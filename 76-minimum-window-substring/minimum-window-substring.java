class Solution {
    public String minWindow(String s, String t) {

        int[] need = new int[128];
        int[] have = new int[128];

        // Store required frequencies
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int formed = 0;          // Number of required characters matched
        int required = t.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            have[ch]++;

            // Current character contributes to satisfying t
            if (have[ch] <= need[ch]) {
                formed++;
            }

            // Window contains all required characters(we shrink when info is right in minwindow)
            while (formed == required) {

                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    start = left; //start is now left now 
                }

                char leftChar = s.charAt(left);

                have[leftChar]--;

                // Removing this character makes the window invalid 
                if (have[leftChar] < need[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
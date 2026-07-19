class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int left = 0;
        int maxfreq =0 ; 
        int maxWindow=0;

        for(int right =0  ; right<s.length();right++){
            //Update the frequency of current character
            freq[s.charAt(right)-'A']++;
            //update the max frequency
            maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
            
            int windowslength = right -left +1;

            //if windowslength - maxfreq > k 
            //we need to shrink
            if(windowslength - maxfreq>k) {
                freq[s.charAt(left)-'A']--;
                left++;

            }

            windowslength = right -left +1;
            maxWindow = Math.max(maxWindow,windowslength);
        }
        return maxWindow;
        
    }
}
class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int sum = 0;
        int res = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Remainder 0 has occurred once
        freq.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            // Handle negative remainder
            if (rem < 0) {
                rem += k;
            }

            if (freq.containsKey(rem)) {
                res += freq.get(rem);
            }

            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }

        return res;
    }
}
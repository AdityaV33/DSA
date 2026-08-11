class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = nums[0];
        int maxEnding = nums[0];
        int maxsum = nums[0];

        int minEnding = nums [0];
        int minsum = nums[0];

        for(int i = 1 ; i< nums.length ;i++){
            total += nums[i];

            maxEnding = Math.max(nums[i],maxEnding+nums[i]);
            maxsum = Math.max(maxsum,maxEnding);

            minEnding=Math.min(nums[i],minEnding+nums[i]);
            minsum = Math.min(minsum,minEnding);
            

            

        }
        //if every elem was neg minsum = maxsum = total and circular formula
            // is total - minsum hence total - minsum =0 which is wrong 
           
         if(maxsum<0){
                return maxsum;
            }
        return Math.max(maxsum,total-minsum);
    }
}
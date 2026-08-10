class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];

        int currmaxsum = nums[0];
        int currminsum = nums[0];

        for(int i = 1 ; i< nums.length; i++){
            currmaxsum=Math.max(currmaxsum+nums[i],nums[i]);
            maxsum = Math.max(currmaxsum,maxsum);
            
            currminsum=Math.min(currminsum+nums[i],nums[i]);
            minsum = Math.min(currminsum,minsum);
        }

        return Math.max(maxsum,Math.abs(minsum));

        

        
    }
}
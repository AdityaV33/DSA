class Solution {
    public int maxSubArray(int[] nums) {
        int  n = nums.length;
        int be=0 ;
        int ans=Integer.MIN_VALUE;
        for(int i =0 ; i < n ; i++){
            int v1 = be+nums[i];
            int v2 = nums[i];

            be = Math.max(v1,v2);
            ans =Math. max(ans,be);
    }

    return ans;
        

}
}
class Solution {
    public int findMin(int[] nums) {
        int lo = 0 ; 
        int n = nums.length;
        int hi = nums.length-1;
        int result = -1;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if(nums[mid]>nums[n-1]) lo = mid+1;
            else{
                result = nums[mid];
                hi= mid-1;
            }
     
        }
        return result;
    }
}
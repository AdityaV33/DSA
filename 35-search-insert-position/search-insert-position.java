class Solution {
    public int searchInsert(int[] nums, int target) {
        int hi = nums.length -1 ;
        int lo = 0;
        
        while(lo<=hi){
           int mid = (lo + hi) /2 ;
            if(nums[mid]==target) return mid ;
            if(nums[mid]>target){
                hi = mid - 1;
                
            }else{
                lo = mid +1;
            }
        }
        return lo ;
    }
}
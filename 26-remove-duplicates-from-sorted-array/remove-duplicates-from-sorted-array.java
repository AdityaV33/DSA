class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0 ;
        
        
        int n = nums.length;

        for(int j =1;j<n;j++){
            if(nums[j-1]!=nums[j]){
                i++;
                nums[i]=nums[j];
            
            }

            
        }
        return i+1;
        
    }
}
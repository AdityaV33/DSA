class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int resultsum = 0;

        for(int i =0; i<n-2;i++){
            int left = i+1;
            int right = n-1;


            while(left<right){
                int total = nums[i]+nums[left]+nums[right];

                int d = Math.abs(target-total);

                if(d<diff){
                    diff = d;
                    resultsum = total;
                }
                if(total == target) return resultsum;

                if(total<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return resultsum;
    }
}
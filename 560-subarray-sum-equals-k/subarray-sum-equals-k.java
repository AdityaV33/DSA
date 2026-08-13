class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 ;
        int res = 0;
       Map<Integer, Integer> freq = new HashMap<>();
       // empty subarray sum 0 has occurred once
       freq.put(0,1);

       for(int i =0 ; i<nums.length;i++ ){
        sum+=nums[i];
        int ques = sum -k;
        if(freq.containsKey(ques)){
            res+=freq.get(ques);
        }
        freq.put(sum,freq.getOrDefault(sum,0)+1);
       }
       return res;
        
    }
}
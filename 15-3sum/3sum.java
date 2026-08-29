class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0 ;
    
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        for(i = 0 ;  i<nums.length -2 ; i++){
            int j = i+1;
            int k  = nums.length-1;
            if(i>0 && nums[i-1]==nums[i] ) continue;


            while(j<k){
                int sum  =  nums[i]+nums[j]+nums[k];
                if(sum >0  ) k--;
                else if (sum<0)j++;
                else{ 
                    l.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    while(j<k && nums[j-1]==nums[j]) j++;
                    while(j<k && nums[k+1]==nums[k]) k--;
                }

            }
        }
        return l;
            
        }
        
    }

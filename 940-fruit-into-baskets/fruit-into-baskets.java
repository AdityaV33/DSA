class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left =0 , maxLen =0 ;
        Map<Integer,Integer> freq = new HashMap <>();

        for(int right = 0 ; right<n;right++){
            freq.put(fruits[right],freq.getOrDefault(fruits[right],0)+1);

            while(freq.size()>2){
                int leftfruit =fruits[left];
                freq.put(leftfruit,freq.get(leftfruit)-1);
                if(freq.get(leftfruit)==0) freq.remove(leftfruit);
                left++;

            }
            maxLen = Math.max(maxLen,right - left+1);
        }
        return maxLen;
        
    }
}
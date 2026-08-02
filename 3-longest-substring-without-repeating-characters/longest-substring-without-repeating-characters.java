class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int low  = 0 ;
        int high = 0;
        int res = 0;
        for(high =0 ; high< s.length();high++){
            char ch = s.charAt(high);

            //adding current char
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            //shrink if duplicate is there
            while(freq.size()<(high-low+1)){
                char leftchar = s.charAt(low);
                freq.put(leftchar,freq.getOrDefault(leftchar,0)-1);

                if(freq.get(leftchar)==0){
                    freq.remove(leftchar);

                }
                low++;
            }
            int len = high - low +1;
           res = Math.max(res,len);

        }

        return res;
    }
}
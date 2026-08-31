class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c: s.toCharArray()){
           mp.put(c,mp.getOrDefault(c,0)+1);
        }
        boolean odd = false;
        int res=0;
        for(int val:mp.values()){
            if(val%2==0) res+=val;
            else{
                odd=true;
                res=res+val-1;
            }
        }
        if(!odd) return res;
        else return res+1;
        
    }
}
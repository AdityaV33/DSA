class Solution {
    public int firstUniqChar(String text) {
        HashMap <Character,Integer> mp = new HashMap<>();
         char[] c = text.toCharArray();
         int n = c.length;
        for(int i = 0 ;i<n;i++){
            if(!mp.containsKey(c[i])){
                mp.put(c[i],1);
            }else{
                mp.put(c[i],mp.get(c[i])+1);
            }
        }
        for(int i = 0;i<n;i++){
            if(mp.get(c[i])==1) return i;
        }
        return -1;
        
    }
}
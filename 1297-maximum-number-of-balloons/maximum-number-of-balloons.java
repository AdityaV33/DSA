class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap <Character,Integer> mp = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for(char c : text.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
         min = Math.min(min,mp.getOrDefault('b',0));
         min = Math.min(min,mp.getOrDefault('a',0));
         min = Math.min(min,mp.getOrDefault('l',0)/2);
         min = Math.min(min,mp.getOrDefault('o',0)/2);
         min = Math.min(min,mp.getOrDefault('n',0));
         return min;
    }
    
}
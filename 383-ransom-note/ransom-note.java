class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);

        }
        for(char c : magazine.toCharArray()){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        for(char c : mp1.keySet()){
            if(!mp2.containsKey(c)||mp2.get(c)<mp1.get(c)){
                return false;
            }
        }
        return true;
        
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word :strs){
            char [] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>()); // map.put for ate becomes key aet - sorted word with value arraylist empty []

            }
            map.get(sortedWord).add(word); // map.get gives array we created and adds the word 
        }
        return new ArrayList<>(map.values()); //map.values return only the values
        
    }
}
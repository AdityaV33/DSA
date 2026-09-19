class Solution {
    public String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2 + 3: max heap
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for(char c : map.keySet()) {
            pq.add(new int[]{c, map.get(c)});
        }

        StringBuilder res = new StringBuilder();

        int[] prev = null;

        while(!pq.isEmpty()) {

            // Highest frequency wala character nikalo
            int[] curr = pq.poll();

            // Answer mein add karo
            res.append((char)curr[0]);

            // Is character ki frequency 1 kam
            curr[1]--;

            // Jo previous character tha,
            // ab usko wapas heap mein daal sakte hain
            if(prev != null && prev[1] > 0) {
                pq.add(prev);
            }

            // Current character ab previous ban gaya
            prev = curr;
        }

        // Agar saare characters use nahi hue,
        // toh arrangement possible nahi tha
        if(res.length() != s.length())
            return "";

        return res.toString();
    }
}
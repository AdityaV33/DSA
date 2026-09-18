class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.first != b.first)
                    return a.first - b.first;

                return b.second.compareTo(a.second);
            }
        );

        for (String word : map.keySet()) {
            pq.add(new Pair(map.get(word), word));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            res.add(pq.poll().second);
        }

        Collections.reverse(res);

        return res;
    }
}

class Pair {
    int first;
    String second;

    Pair(int f, String s) {
        first = f;
        second = s;
    }
}
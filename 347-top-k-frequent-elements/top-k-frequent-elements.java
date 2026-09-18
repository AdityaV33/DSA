class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap <>();
        //frequency count 
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        //min heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(int x : map.keySet()){
            pq.add(new int []{x, map.get(x)});

            if(pq.size()>k) pq.poll();
        }
        int [] res = new int [k];
        for(int i = 0 ; i<k;i++) res[i]=pq.poll()[0];
        return res;

    }
}
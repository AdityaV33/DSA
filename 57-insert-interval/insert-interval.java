class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;


        //to add intervals before new interval to check if does current end < new interval start? if they dont overlap add it to res
        while(i<n && intervals [i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        //does current start <= new interval end if yes merge
        while(i<n && intervals[i][0]<= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }

        //for newInterval = [2,5] and current [1,3] we ge [1,5]
         //add merged interval
        res.add (newInterval);
        

        //add remaining intervals
        while(i<n){

            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int [res.size()][]);

    }
}
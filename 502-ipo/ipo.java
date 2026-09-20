class Solution {
    public int findMaximizedCapital(
            int k,
            int w,
            int[] profits,
            int[] capital) {

        int n = profits.length;

        int[][] proj = new int[n][2];

        // Store {capital, profit}
        for (int i = 0; i < n; i++) {
            proj[i][0] = capital[i];
            proj[i][1] = profits[i];
        }

        // Sort projects by required capital
        Arrays.sort(proj, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        // Max heap: highest profit at top
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> b - a);

        int idx = 0;

        for (int count = 0; count < k; count++) {

            // Add all affordable projects
            while (idx < n && proj[idx][0] <= w) {
                pq.add(proj[idx][1]);
                idx++;
            }

            // No affordable project available
            if (pq.isEmpty()) {
                return w;
            }

            // Select project with maximum profit
            w = w + pq.poll();
        }

        return w;
    }
}
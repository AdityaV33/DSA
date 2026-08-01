class Solution {
    public double findMaxAverage(int[] arr , int k) {
        int n = arr.length;
        if(n<k) return 0;

        int windowSum = 0;
        double maxsum = Integer.MIN_VALUE;

        for(int i =0;i<k;i++){
            windowSum +=arr[i];
        }
        maxsum = windowSum;
        //slide the window
        for(int i = k ; i<n;i++){
            windowSum += arr[i]-arr[i-k];
            maxsum = Math.max(maxsum,windowSum);
        }
        return maxsum/k;
        
    }
}
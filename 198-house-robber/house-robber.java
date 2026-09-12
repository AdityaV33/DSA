class Solution {
    int[][] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n][2];

        for(int i=0;i<n;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return fun(nums,n,0,1);
        
    }
    public int fun(int[] a,int n,int i,int free){
        if(i==n) return 0;
        if(dp[i][free]!=-1) return dp[i][free];

        if(free==0) return dp[i][free] = fun(a,n,i+1,1);
        int c1 = a[i]+fun(a,n,i+1,0);
        int c2 = fun(a,n,i+1,1);
        dp[i][free]=Math.max(c1,c2);
        return dp[i][free];
    }
}
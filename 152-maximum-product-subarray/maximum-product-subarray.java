class Solution {
    public int maxProduct(int[] a) {
        int n = a.length;
        int be  = a[0];
        int ans = a[0];
        int mine = a[0];

        for(int i=1 ; i<n ; i++){
            int v1 = a[i];
            int v2 = a[i]*be ;
            int v3 = a[i]*mine;
           int  newbe = Math.max(v1,Math.max(v2,v3));
           int  newmine=Math.min(v1,Math.min(v3,v2));

             be = newbe;
             mine=newmine;
             ans = Math.max(ans,Math.max(be,mine));
        }
        return ans;
        
    }
}
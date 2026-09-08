class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int lo= 1;
        int hi = 0;
        for(int i = 0 ; i<n ; i++){
            hi = Math.max(hi,piles[i]);
        }
        int res = -1;
        while(lo<=hi){
            int guess = lo + (hi-lo)/2;
            long hour = 0 ;
            //calculating how many hours for this paticular guess
            for(int i =0 ; i<n ;i++){
                hour+=(piles[i]+guess-1)/guess;
            }
            if(hour>h){
                lo = guess+1; 

            }else{
                //speed worked need to try smaller 
                res  = guess ;
                hi = guess - 1;
            }
        }
        return res ;
    }
}
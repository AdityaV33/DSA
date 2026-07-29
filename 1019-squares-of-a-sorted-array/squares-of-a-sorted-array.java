class Solution {
    public int[] sortedSquares(int[] nums) {
        int negcount = 0;
        int poscount=0;


        //count pos and negs
        for(int num:nums){
            if(num<0) negcount++;
            else poscount++;
        }

        int[] neg =new int [negcount];
        int[] pos = new int[poscount];

        int ni=0;
        int pi=0;

        // fill the arrays
        for(int num:nums){
            if(num<0){
                neg[ni++] = num;
            }
            else pos[pi++] = num;
        }

        //square negs
        for(int i =0; i<negcount;i++) neg[i]*=neg[i];

        //reverse negs
        for (int l = 0, r = negcount - 1; l < r; l++, r--) {
            int temp = neg[l];
            neg[l] = neg[r];
            neg[r] = temp;
        }

        //square pos
        for(int i= 0 ; i<poscount;i++){
            pos[i]*=pos[i];

        }

        //merge
        int [] res = new int [nums.length];

        int i = 0 ;
         int j = 0;
         int idx =0;

         while(i<negcount && j<poscount){
            if(neg[i]<= pos[j]){
                res[idx++] = neg[i++];
            }else{
                res[idx++]=pos[j++];
            }
         }

         while(i<negcount) res[idx++]=neg[i++];
         while(j<poscount) res[idx++]=pos[j++];

         return res;
        
    }
}
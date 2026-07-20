class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m =s2.length();

        if(n>m) return false;
        int [] freq_s1 = new int [26];
        int [] freq_s2 = new int [26];

        for(int i = 0 ; i<n;i++){
            freq_s1[s1.charAt(i)-'a']++;
        }

        int i = 0 ; 
        int j = 0 ;
        while(j<m){
            freq_s2[s2.charAt(j)-'a']++;
            if(j-i+1>n){
                freq_s2[s2.charAt(i)-'a']--;
                i++;
            }
            if(Arrays.equals(freq_s1,freq_s2)) return true;
            j++;
        }
        
    
        return false; 
        
    }
    
} 
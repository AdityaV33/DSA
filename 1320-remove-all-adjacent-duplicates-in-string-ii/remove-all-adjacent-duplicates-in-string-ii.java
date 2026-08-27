class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <int[]> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&& st.peek()[0]==c){
                st.peek()[1]++;

                if(st.peek()[1]==k){
                    st.pop();
                }
            }else{
                st.push(new int []{c,1});
            }
        }
        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            int [] p = st.pop();
            for(int i = 0; i<p[1];i++){
                res.append((char)p[0]);
            }
        }
        return res.reverse().toString();
    }
}
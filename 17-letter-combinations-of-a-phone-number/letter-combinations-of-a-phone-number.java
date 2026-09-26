class Solution {
    List<String> result = new ArrayList<>(); //to store all combos list of string

    
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){ return new ArrayList<>();}//if digit no. is 0 so we'll just return a empty arraylist
     
   HashMap<Character, String> mp = new HashMap<>();

        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        StringBuilder temp = new StringBuilder(""); // we store the combos here
        solve(0,digits,temp,mp);
        return result;
    }

        void solve(int idx , String digits,StringBuilder temp , HashMap <Character ,String> mp){
            if(idx >= digits.length()){
                result.add(temp.toString()); 
                // basically idx is the var on top of digits so if its more than the length of digits for eg . digits = 23 and idx = 2 then nothing else is left to make a combo of hence push it into result
                return;
            }

            char ch = digits.charAt(idx); // the digit currently
            String str = mp . get(ch); // the str  we will get from that paticular digit

            for(int i = 0 ; i<str.length();i++){
                //do
                temp.append(str.charAt(i));
                solve(idx+1,digits,temp,mp); //for exploring we called recursion
                temp.deleteCharAt(temp.length()-1); // basically pehlde do may humne pehla letter dala tha to ab usko hatane ke lie ye visualise krna hoga
                
            }

        }
    }


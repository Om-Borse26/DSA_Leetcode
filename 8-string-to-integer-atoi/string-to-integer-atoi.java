class Solution {

    public static int helper(String s,int i, int sign, int result, boolean started){

        if (i == s.length()) {
            return sign * result;
        }
        
        char ch = s.charAt(i);

        if(!started){
        if(ch == ' '){
            return helper(s,i+1,1,0,false);
        }
        if(ch == '+'){
            return helper(s,i+1,1,result,true);
        }
        if(ch == '-'){
            return helper(s,i+1,-1,result,true);
        }
        if(Character.isDigit(ch)){
            return helper(s,i+1,sign,ch - '0',true);
        }
        } else {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                int newResult = result * 10 + digit;
                return helper(s, i + 1, sign, newResult, true);
            } 
        }
    return sign * result;
}


    public int myAtoi(String s) {

        return helper(s,0,1,0,false);
        // int i = 0;
        // int n = s.length();
        // int sign = 1;

        // s = s.trim();

        // if (n > 0 && i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        //     if (s.charAt(i) == '-') {
        //         sign = -1;
        //     }
        //     i++;
        // }

        // int num = 0;

        // while (i < s.length() && Character.isDigit(s.charAt(i))) {
        //     int digit = s.charAt(i) - '0';

        //     if (num > (Integer.MAX_VALUE - digit) / 10) {
        //         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        //     }

        //     num = num * 10 + digit;
        //     i++;
        // }

        // return num * sign;


    }
}
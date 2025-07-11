class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                temp.add(s.charAt(i));
            }
            else{
                if(temp.isEmpty()){
                    return false;
                }
                if(s.charAt(i) == ')' && temp.peek() == '('){
                    temp.pop();
                }
                else if(s.charAt(i) == '}' && temp.peek() == '{'){
                    temp.pop();
                }
                else if(s.charAt(i) == ']' && temp.peek() == '['){
                    temp.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(temp.isEmpty()){
            return true;
        }
        return false;
    }
}
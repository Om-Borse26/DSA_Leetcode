class Solution {
    public boolean isPalindrome(int x) {
        int result = 0;
        int original = x;
        if(x<0) {
            return false;
        }
        else if(x>=0 && x<10){
            return true;
        }

        while(x!=0){
            result = result*10 + x%10;
            x = x/10;
        }
        
        return result == original;
    }
}
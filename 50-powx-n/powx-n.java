class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1.0 / (x * myPow(x, Integer.MAX_VALUE));
            }
            return 1.0 / myPow(x, -n);
        }
        
        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
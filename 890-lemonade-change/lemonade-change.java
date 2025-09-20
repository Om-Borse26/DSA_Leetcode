class Solution {
    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0;  // Count of $5 bills
        int count10 = 0; // Count of $10 bills
        
        for(int bill : bills) {
            if(bill == 5) {
                count5++; // No change needed
            }
            else if(bill == 10) {
                if(count5 > 0) {
                    count5--; // Give $5 change
                    count10++; // Keep the $10
                } else {
                    return false; // Can't give change
                }
            }
            else if(bill == 20) {
                // Try to give $10 + $5 first (optimal)
                if(count10 > 0 && count5 > 0) {
                    count10--;
                    count5--;
                } 
                // Otherwise give three $5 bills
                else if(count5 >= 3) {
                    count5 -= 3;
                } 
                else {
                    return false; // Can't give change
                }
            }
        }
        return true;
    }
}
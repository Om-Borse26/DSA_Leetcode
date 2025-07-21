class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int p1 = i;
                int p2 = j;
                boolean isPalindrome = true;

                while (p1 < p2) {
                    if (s.charAt(p1) != s.charAt(p2)) {
                        isPalindrome = false;
                        break;
                    }
                    p1++;
                    p2--;
                }

                if (isPalindrome && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}
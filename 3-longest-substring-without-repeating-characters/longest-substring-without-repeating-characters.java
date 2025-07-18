class Solution {
    // public int lengthOfLongestSubstring(String s) {
    //     if (s.length() <= 1) return s.length();
        
    //     int maxcount = 0;
    //     int p1 = 0;
        
    //     while (p1 < s.length()) {
    //         boolean[] seen = new boolean[128]; 
    //         int p2 = p1;
            
    //         while (p2 < s.length() && !seen[s.charAt(p2)]) {
    //             seen[s.charAt(p2)] = true;
    //             p2++;
    //         }
            
    //         maxcount = Math.max(maxcount, p2 - p1);
    //         p1++; 
    //     }
        
    //     return maxcount;
    // }


    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        int left = 0;
        int[] last = new int[128];
        for (int r = 0; r < n; r++) {
            left = Math.max(left, last[s.charAt(r)]);
            max = Math.max(max, r - left + 1);
            last[s.charAt(r)] = r + 1;
        }
        return max;
    }
}
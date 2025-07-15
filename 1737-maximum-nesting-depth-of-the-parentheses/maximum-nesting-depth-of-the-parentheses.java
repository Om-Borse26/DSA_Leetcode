class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;       // To track the maximum depth encountered
        int currentDepth = 0;   // To track the current depth as we parse the string

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;                         // Going one level deeper
                maxDepth = Math.max(maxDepth, currentDepth);  // Update max if deeper
            } else if (c == ')') {
                currentDepth--;                         // Going one level shallower
            }
        }

        return maxDepth;
    }
}

class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                
                int[] freq = new int[26];
                for (int k = 0; k < substring.length(); k++) {
                    freq[substring.charAt(k) - 'a']++;
                }
                
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {  
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }
                
                if (minFreq != Integer.MAX_VALUE) {  
                    totalBeauty += (maxFreq - minFreq);
                }
            }
        }
        
        return totalBeauty;
    }
}
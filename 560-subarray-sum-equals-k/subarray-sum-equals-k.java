class Solution {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        
        // Initialize: empty subarray has sum 0
        prefixSumCount.put(0, 1);
        
        for (int num : nums) {
            prefixSum += num;
            
            // Check if (prefixSum - k) exists
            // If yes, it means there's a subarray ending at current position with sum k
            if (prefixSumCount.containsKey(prefixSum - k)) {
                count += prefixSumCount.get(prefixSum - k);
            }
            
            // Add current prefix sum to map
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
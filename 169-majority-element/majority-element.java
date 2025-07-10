class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int candidate = nums[nums.length / 2]; 
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return 0;
        }
        
    }
}
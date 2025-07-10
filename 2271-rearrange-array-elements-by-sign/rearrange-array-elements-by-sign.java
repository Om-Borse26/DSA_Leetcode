class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int even_index = 0;
        int odd_index = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                ans[even_index] = nums[i];
                even_index = even_index+2;
            }
            else{
                ans[odd_index] = nums[i];
                odd_index = odd_index+2;
            }
        }
        return ans;
    }
}
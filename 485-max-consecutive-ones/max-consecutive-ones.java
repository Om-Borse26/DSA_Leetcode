class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length-1;
        int max =0;
        int count = 0;

        for(int i=0;i<=n;i++){
            if(nums[i] == 0){
                count = 0;
            }
            else{
                count++;
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
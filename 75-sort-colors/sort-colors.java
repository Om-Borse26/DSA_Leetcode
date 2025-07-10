class Solution {
    public void sortColors(int[] nums) {
        // int index = 0;
        // int[] temp = new int[nums.length];
        // for (int color = 0; color <= 2; color++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if(nums[j] == color){
        //             temp[index] = nums[j];
        //             index++;
        //         }
        //     }
        // }

        // for (int i = 0; i < temp.length; i++) {
        //     nums[i] = temp[i];
        // }
        

        // Dutch National Flag Method
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}
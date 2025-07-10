class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){return 0;}
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    count = count+1;

                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
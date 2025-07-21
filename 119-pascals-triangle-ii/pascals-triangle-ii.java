class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i = 1; i <= rowIndex; i++) {
            // Use long to avoid overflow in intermediate multiplication
            long temp = (long)ans.get(i - 1) * (rowIndex - i + 1) / i;
            ans.add((int)temp);
        }
        return ans;
    }
}
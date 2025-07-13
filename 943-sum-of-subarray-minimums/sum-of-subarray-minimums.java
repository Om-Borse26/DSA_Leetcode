class Solution {
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        
        // Arrays to store previous and next smaller elements
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        
        // Find previous smaller elements
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            prevSmaller[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        // Clear stack for next smaller elements
        st.clear();
        
        // Find next smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nextSmaller[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        long result = 0;
        
        // Calculate contribution of each element
        for (int i = 0; i < n; i++) {
            long left = i - prevSmaller[i];  // Number of subarrays where arr[i] is minimum on the left
            long right = nextSmaller[i] - i; // Number of subarrays where arr[i] is minimum on the right
            long contribution = (left * right * arr[i]) % MOD;
            result = (result + contribution) % MOD;
        }
        
        return (int) result;
    }
}
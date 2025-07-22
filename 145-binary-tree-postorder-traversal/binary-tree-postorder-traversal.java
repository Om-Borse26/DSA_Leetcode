/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // public static void helper(TreeNode root, List<Integer> l1){
    //     if(root == null){
    //         return;
    //     }

    //     helper(root.left, l1);
    //     helper(root.right,l1);
    //     l1.add(root.val);
    // }

    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> l1 = new ArrayList<>();
    //     helper(root, l1);

    //     return l1;
    // }

    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> l1 = new ArrayList<>();
    //     Stack<TreeNode> stack = new Stack<>();
        
    //     TreeNode temp = root;

    //     while (temp != null || !stack.isEmpty()) {
    //         while (temp != null) {
    //             stack.push(temp);
    //             temp = temp.left;
    //         }
    //         temp = stack.pop();
    //         l1.add(temp.val);
    //         temp = temp.right;
    //     }
    //     return l1;
    // }

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> l1 = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if(root == null){
            return l1;
        }

        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode temp = stack1.pop();
            stack2.push(temp);

            if(temp.left != null){
                stack1.push(temp.left);
            }
            if(temp.right != null){
                stack1.push(temp.right);
            }
        }

        while(!stack2.isEmpty()){
            l1.add(stack2.pop().val);
        }
        return l1;
    }
}
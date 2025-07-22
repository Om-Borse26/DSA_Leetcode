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
    //     l1.add(root.val);
    //     helper(root.right,l1);
    // }

    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> l1 = new ArrayList<>();
    //     helper(root, l1);

    //     return l1;
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        result.add(current.val);
        current = current.right;
    }
    return result;
}

}


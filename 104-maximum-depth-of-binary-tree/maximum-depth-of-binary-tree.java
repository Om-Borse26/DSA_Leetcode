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
    public static int maxDepth(TreeNode root, int height){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left, height++), maxDepth(root.right, height++)) + 1;
    }

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);    
    }
}
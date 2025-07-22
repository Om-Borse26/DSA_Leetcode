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
    public static int depth(TreeNode root, int height){
        if(root == null){
            return 0;
        }
        return 1+Math.max(depth(root.left, height++), depth(root.right, height++));
    }

    public int maxDepth(TreeNode root) {
        return depth(root, 0);    
    }
}
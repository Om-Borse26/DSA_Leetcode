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

    int smallest = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return smallest;
        }
        kthSmallest(root.left,k);
        count++;
        if(count == k){
            smallest = root.val;
        }
        kthSmallest(root.right,k);

        return smallest;
    }
}
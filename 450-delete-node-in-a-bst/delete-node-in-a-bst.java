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

    public TreeNode helper(TreeNode root){
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }

        TreeNode rightSubTree = root.right;
        TreeNode rightMostNode = returnRightMost(root.left);
        rightMostNode.right = rightSubTree;

        return root.left;
    }

    public TreeNode returnRightMost(TreeNode root){
        if(root.right == null){
            return root;
        }
        return returnRightMost(root.right);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val == key){
            return helper(root);
        }

        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            root.left = deleteNode(root.left,key);
        }
        return root;
    }
}
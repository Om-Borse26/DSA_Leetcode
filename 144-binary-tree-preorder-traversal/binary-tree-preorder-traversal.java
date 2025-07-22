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

    //     l1.add(root.val);
    //     helper(root.left, l1);
    //     helper(root.right,l1);
    // }

    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> l1 = new ArrayList<>();
    //     helper(root, l1);

    //     return l1;
        
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> l1 = new ArrayList<>();

        if(root == null){
            return l1;
        }
        s.push(root);
        while(!s.isEmpty()){
            root = s.pop();
            l1.add(root.val);
            if(root.right != null){
                s.push(root.right);
            }
            if(root.left != null){
                s.push(root.left);
            }
        }
        return l1;
    }
}
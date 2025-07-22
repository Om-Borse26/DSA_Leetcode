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

    // public static void helper(TreeNode root, List<List<Integer>> l1){

    //     if(root == null){
    //         return;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);
    //     q.add(null);

    //     while(!q.isEmpty()){
    //         int size = q.size();
    //         List<Integer> temp = new ArrayList<>();
    //         for(int i=0;i<size;i++){
    //         TreeNode currentNode = q.remove();
    //         if(currentNode == null){
    //             if(q.isEmpty()){
    //                 break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         else{
    //             temp.add(currentNode.val);
    //             if(currentNode.left != null){
    //                 q.add(currentNode.left);
    //             }
    //             if(currentNode.right != null){
    //                 q.add(currentNode.right);
    //             }
    //         }
    //         }
            
    //         l1.add(temp);
    //     }
    // }

    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> l1 = new ArrayList<>();
    //     helper(root, l1);
    //     return l1;
    // }

    List<List<Integer>> levels=new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return levels;
        helper(root, 0);
        return levels;    
    }
    public void helper(TreeNode node, int level){
        if(levels.size()==level){
            levels.add(new ArrayList<Integer>());
        }
        levels.get(level).add(node.val);
        if(node.left!=null) helper(node.left,level+1);
        if(node.right!=null)helper(node.right,level+1);
    }
}
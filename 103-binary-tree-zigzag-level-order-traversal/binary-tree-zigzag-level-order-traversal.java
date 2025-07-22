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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        List<List<Integer>> l1 = new ArrayList<>();

        if(root == null){
            return l1;
        }

        boolean flag = true;

        q1.add(root);
        while(!q1.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q1.size();
            for(int i=0;i<size;i++){
                if(q1.peek().left != null){
                    q1.add(q1.peek().left);
                }
                if(q1.peek().right != null){
                    q1.add(q1.peek().right);
                }

                if(flag){
                    temp.add(q1.poll().val);
                }
                else{
                    temp.add(0,q1.poll().val);
                }

            }
            flag = !flag;
            l1.add(temp);
        }
        return l1;
    }
}
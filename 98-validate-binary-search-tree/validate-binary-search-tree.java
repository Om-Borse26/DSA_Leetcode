class Solution {
    private TreeNode prev = null;
    
    public boolean isValidBST(TreeNode root) {
        prev = null; 
        return inorderCheck(root);
    }
    
    private boolean inorderCheck(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (!inorderCheck(root.left)) {
            return false;
        }
        
        if (prev != null && root.val <= prev.val) {
            return false;
        }
        prev = root;
        
        return inorderCheck(root.right);
    }
}
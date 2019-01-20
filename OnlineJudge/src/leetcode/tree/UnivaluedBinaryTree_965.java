package leetcode.tree;

public class UnivaluedBinaryTree_965 {
	public boolean UnivaluedBinaryTree_965(TreeNode root) {
        if(root==null)
            return true;
        return traversal(root, root.val);
    }
    
    public boolean traversal(TreeNode root, int value) {
        if(root==null)
            return true;
        if(!traversal(root.left, value))
            return false;
        if(root.val!=value)
            return false;
        if(!traversal(root.right, value))
            return false;
        
        return true;
        
    }
}

package leetcode.tree;

public class ValidateBinarySearchTree_98 {

	public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean lowerBound=false, upperBound=false;
        int lower=0, upper=0;
        return traversal(root, lowerBound, upperBound, lower, upper);
    }
    
    public boolean traversal(TreeNode node, boolean lowerBound, boolean upperBound, int lower, int upper) {
        if(lowerBound) {
            if(node.val<=lower)
                return false;
        }
        if(upperBound) {
            if(node.val>=upper)
                return false;
        }
        if(node.left!=null)
            if(!traversal(node.left, lowerBound, true, lower, node.val))
                return false;
        if(node.right!=null)
            if(!traversal(node.right, true, upperBound, node.val, upper))
                return false;
        return true;
    }
}

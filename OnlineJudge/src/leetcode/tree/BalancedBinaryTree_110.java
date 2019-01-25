package leetcode.tree;

public class BalancedBinaryTree_110 {

	boolean check=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        traversal(root);
        return check;
    }
    public int traversal(TreeNode node) {
        int left=0, right=0;
        if(node==null || !check)
            return 0;
        left=traversal(node.left);
        right=traversal(node.right);
        if(Math.abs(left-right)>1)
            check=false;
        return Math.max(left,right)+1;
    }
}

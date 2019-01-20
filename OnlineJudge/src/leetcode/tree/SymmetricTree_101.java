package leetcode.tree;

public class SymmetricTree_101 {

	/*
	 * symmetric한지 살펴보는 것이니 왼쪽/오른쪽으로 각각 탐색하여 값이 올바른지 확인
	 * */
	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return checkNode(root.left, root.right);
    }
    
    public boolean checkNode(TreeNode left, TreeNode right) {
        if(left==null && right==null) return true;
        if(left==null || right==null)
            return false;
        if(left.val!=right.val) return false;
        return checkNode(left.left, right.right) && checkNode(right.left, left.right);
    }
}

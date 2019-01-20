package leetcode.tree;

public class InsertintoABinarySearchTree_701 {

	/*
	 * 제일 간단... 기본 이진트리의 삽입
	 * */
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        
        if(val<root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        
        return root;
    }
}

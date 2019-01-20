package leetcode.tree;

public class KthSmallestElementinABST_230 {

	public static int depth=0;
    public int kthSmallest(TreeNode root, int k) {
        depth=0;
        int ret = travel(root, k);
            return ret;
    }
    public int travel(TreeNode node, int min) {
        int ret=0, right=0, left=0;
        if(node.left != null)
            left=travel(node.left, min);
        depth++;
        if(depth==min)
            ret = node.val;
        if(node.right!=null)
            right=travel(node.right, min);
        if(ret!=0)
            return ret;
        else if(left!=0)
            return left;
        else if(right!=0)
            return right;
        else
            return 0;
    }
}

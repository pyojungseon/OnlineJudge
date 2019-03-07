package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {

	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        traversal(root, ret);
        return ret;
    }
    
    public void traversal(TreeNode node, List<Integer> ret) {
        if(node==null) return;
        traversal(node.left, ret);
        traversal(node.right, ret);
        ret.add(node.val);
    }
}

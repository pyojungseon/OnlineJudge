package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {

	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        traversal(root, ret);
        return ret;
    }
    
    public void traversal(TreeNode root, List<Integer> list) {
        if(root==null)
            return;
        list.add(root.val);
        traversal(root.left, list);
        traversal(root.right, list);
    }
}

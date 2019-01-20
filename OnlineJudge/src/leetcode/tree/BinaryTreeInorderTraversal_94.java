package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

	public List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null)
            list = traversal(root);
        return list;
    }
    
    public List<Integer> traversal(TreeNode root) {
        if(root.left!=null)
            traversal(root.left);
        list.add(root.val);
        if(root.right!=null) 
            traversal(root.right);
        
        return list;
    }
}

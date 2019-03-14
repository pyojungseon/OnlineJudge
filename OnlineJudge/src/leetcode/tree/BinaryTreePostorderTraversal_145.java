package leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {

	public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode p = root;
        while(!stack.isEmpty() || p!=null) {
            if(p!=null) {
                stack.add(p);
                ret.addFirst(p.val);
                p=p.right;
            }
            else {
                TreeNode node = stack.pop();
                p = node.left;
            }
            
        }
        return ret;
        
    }
}

package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal_103 {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ret = new ArrayList<>();
	    Stack<TreeNode> stack = new Stack<>();
	    boolean flag= true;
	    
	    if(root==null)
	        return new ArrayList<>();
	    
	    stack.push(root);
	    while(stack.size()>0) {
	        List<Integer> nodeList = new ArrayList<>();
	        int size=stack.size();
	        Stack<TreeNode> newStack = new Stack<>();
	        for(int i=0;i<size;i++) {
	            TreeNode node = stack.pop();
	            nodeList.add(node.val);
	            if(flag) {
	                if(node.left!=null) newStack.add(node.left);
	                if(node.right!=null) newStack.add(node.right);
	            } else {
	                if(node.right!=null) newStack.add(node.right);
	                if(node.left!=null) newStack.add(node.left);
	            }
	        }
	        stack=newStack;
	        flag=!flag;
	        ret.add(nodeList);
	    }
	    return ret;
	}
}

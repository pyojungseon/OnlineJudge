package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversal_II_107 {

	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root==null) return ret;
        Queue<TreeNode> que = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        
        
        que.add(root);
        while(!que.isEmpty()) {
            int size=que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                list.add(node.val);
                
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            stack.add(list);
        }
        while(!stack.isEmpty()) {
            ret.add(stack.pop());
        }
        
        return ret;
    }
}

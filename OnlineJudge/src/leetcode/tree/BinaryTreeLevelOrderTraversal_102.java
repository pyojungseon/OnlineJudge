package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_102 {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null)
            return new ArrayList<>();
        
        que.offer(root);
        while(que.size()>0) {
            int size=que.size();
            List<Integer> value = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                value.add(node.val);
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            ret.add(value);
        }
        return ret;
    }
}

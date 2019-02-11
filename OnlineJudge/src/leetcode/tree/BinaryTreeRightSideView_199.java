package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView_199 {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null) return ret;
        Queue<TreeNode> que = new LinkedList<>();
        
        que.add(root);
        
        while(que.size()>0) {
            int size = que.size();
            
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
                
                if(i==size-1)
                    ret.add(node.val);
            }
        }
        return ret;
    }
}

package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree_104 {

	public int maxDepth(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        int depth=0;
        que.add(root);
        if(que.isEmpty() || root == null)
            return 0;
        while(!que.isEmpty()) {
            int length = que.size();
            depth++;
            for(int i=0;i<length;i++) {
                TreeNode node = que.poll();
                if(node.left!=null)
                    que.add(node.left);
                if(node.right!=null) 
                    que.add(node.right);
            }
        }
        
    return depth;
    }
}

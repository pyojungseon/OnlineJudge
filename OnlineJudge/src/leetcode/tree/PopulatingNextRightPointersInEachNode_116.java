package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode_116 {

	
	public class TreeLinkNode {
	     int val;
	     TreeLinkNode left, right, next;
	     TreeLinkNode(int x) { val = x; }
	}
	
	public void connect(TreeLinkNode root) {
        if(root==null) return;
        
        Queue<TreeLinkNode> que = new LinkedList<>();
        que.offer(root);
        
        while(que.size()>0) {
            int size = que.size();
            
            for(int i=0;i<size;i++) {
                TreeLinkNode node = que.poll();
                if(i==size-1)
                    node.next = null;
                else
                    node.next = que.peek();
                
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
        }
    }
}

package leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfN_aryTree_559 {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	
	public int maxDepth(Node root) {
        int depth=0, length=0;
        if(root==null)
            return 0;
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);
        while(!que.isEmpty()) {
            depth++;
            length=que.size();
            for(int i=0;i<length;i++) {
            Node node = que.poll();
                que.addAll(node.children);
            }
        }
        return depth;
    }
}

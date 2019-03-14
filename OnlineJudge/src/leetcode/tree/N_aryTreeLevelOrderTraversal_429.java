package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal_429 {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
	
	public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root==null) return ret;
        Queue<Node> que = new LinkedList<>();
        
        que.add(root);
        while(!que.isEmpty()) {
            int size=que.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++) {
                Node node = que.poll();
                list.add(node.val);
                if(node.children!=null) {
                    for(int j=0;j<node.children.size();j++) {
                        que.add(node.children.get(j));
                    }
                }
            }
            ret.add(list);
        }
        
        
        return ret;
    }
}

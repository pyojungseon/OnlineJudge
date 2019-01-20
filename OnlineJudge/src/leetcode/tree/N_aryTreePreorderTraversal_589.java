package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal_589 {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	}
	
	public List<Integer> preorder(Node root) {
        List<Integer> ret = new ArrayList<Integer>();
        traversal(root, ret);
        return ret;
    }
    
    public void traversal(Node root, List<Integer> ret) {
        if(root==null) 
            return;
        ret.add(root.val);
        for(Node single : root.children) {
            traversal(single, ret);
        }
    }
}

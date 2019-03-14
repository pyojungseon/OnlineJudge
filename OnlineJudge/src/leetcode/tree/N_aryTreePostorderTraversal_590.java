package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePostorderTraversal_590 {

	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val,List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};

	public List<Integer> postorder(Node root) {
        List<Integer> ret = new ArrayList<>();
        if(root==null) return ret;
        traversal(root, ret);
        return ret;
    }
    
    public void traversal(Node node, List<Integer> ret) {
        if(node==null) return;
        if(node.children!=null) {
            for(int i=0;i<node.children.size();i++) {
                traversal(node.children.get(i), ret);
            }
        }
        ret.add(node.val);
    }
}

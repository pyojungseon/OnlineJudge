package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath_257 {

	public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<String>();
        List<String> ret = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        traversal(root, ret, num);
        return ret;
    }
    
    public void traversal(TreeNode node, List<String> ret, List<Integer> num) {
        num.add(node.val);
        if(node.left==null && node.right==null) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<num.size();i++) {
                sb.append(num.get(i));
                if(i!=num.size()-1) {
                    sb.append("->");
                }
            }
            ret.add(sb.toString());
        }
        if(node.left!=null)
            traversal(node.left, ret, num);
        if(node.right!=null)
            traversal(node.right, ret, num);
        num.remove(num.size()-1);
    }
}

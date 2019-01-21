package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers_129 {

	public int sumNumbers(TreeNode root) {
        int sum=0, depth=0;
        List<Integer> list = new ArrayList<>();
        if(root==null) return 0;
        
        return traversal(root, list, depth);
        
    }
    
    public int traversal(TreeNode node, List<Integer> list, int depth) {
        
        int number=0;
        if(list.size()<=depth)
            list.add(node.val);
        else
            list.set(depth, node.val);
        
        if(node.left==null && node.right==null) {
            for(int i=0;i<=depth;i++) {
                number = number*10+list.get(i);
            }
        }
        if(node.left!=null) number+=traversal(node.left, list, depth+1);
        if(node.right!=null) number+=traversal(node.right, list, depth+1);
        
        return number;
    }
}

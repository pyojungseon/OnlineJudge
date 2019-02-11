package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves_404 {

	public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        List<Integer> ret = new ArrayList<>();
        traversal(root, ret, false);
        
        int sum=0;
        for(int a:ret)
            sum+=a;
        
        return sum;
    }
    
    public void traversal(TreeNode root, List<Integer> ret, boolean left) {
        if(root.left==null && root.right==null) {
            if(left) ret.add(root.val);
            return;
        }
        
        if(root.left!=null) traversal(root.left, ret, true);
        if(root.right!=null)
            traversal(root.right, ret, false);
        
    }
}

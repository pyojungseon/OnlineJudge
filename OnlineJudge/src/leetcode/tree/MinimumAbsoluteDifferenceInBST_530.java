package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST_530 {

	int dist=Integer.MAX_VALUE;
    int prev=0;
    boolean isPrev=false;
    
    public int getMinimumDifference(TreeNode root) {
        //inOrder(root);
        List<Integer> list = new ArrayList<>();
        inOrder2(root, list);
        for(int i=1;i<list.size();i++) {
            dist=Math.min(dist, list.get(i)-list.get(i-1));
        }
        
        return dist;
    }
    
    public void inOrder(TreeNode root) {
        if(root==null) return;
        
        inOrder(root.left);
        if(!isPrev)
            isPrev=true;
        else 
            dist = Math.min(dist, root.val-prev);
        
        prev = root.val;
        inOrder(root.right);
    }
    
    public void inOrder2(TreeNode root, List<Integer> list) {
        if(root==null) return;
        inOrder2(root.left, list);
        list.add(root.val);
        inOrder2(root.right, list);
        
    }
}

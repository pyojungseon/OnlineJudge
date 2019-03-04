package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBST_938 {

	public int rangeSumBST(TreeNode root, int L, int R) {
        int sum=0;
        if(root==null)
            return sum;
        List<Integer> range = new ArrayList<>();
        traversal(root, range, L, R);
        for(int num : range)
            sum+=num;
        
        return sum;
    }
    public void traversal(TreeNode root, List<Integer> range, int L, int R) {
        if(root==null)
            return;
        if(root.val>=L && root.val<=R) {
            range.add(root.val);
        }
        if(L<=root.val) traversal(root.left, range, L, R);
        if(R>=root.val) traversal(root.right, range, L, R);
    }
}

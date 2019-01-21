package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow_515 {

	public List<Integer> largestValues(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        
        if(root==null)
            return new ArrayList<>();
        
        que.add(root);
        while(que.size()>0) {
            int size = que.size();
            int max = Integer.MIN_VALUE;
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                if(node.val>max) max=node.val;
                if(node.left!=null) que.add(node.left);
                if(node.right!=null)
                    que.add(node.right);
            }
            ret.add(max);
        }
        return ret;
    }
}

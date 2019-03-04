package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree_637 {

	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        while(!que.isEmpty()) {
            int size=que.size();
            double sum =0;
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                sum+=node.val;
                if(node.left!=null) que.add(node.left);
                if(node.right!=null) que.add(node.right);
            }
            ret.add(sum/(double)size);
        }
        return ret;
    }
}

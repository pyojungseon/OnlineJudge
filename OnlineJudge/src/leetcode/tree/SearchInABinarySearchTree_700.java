package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInABinarySearchTree_700 {

	/*
	 * 제일 간단... 기본 이진트리의 삽입
	 * */
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(18);
		root.left = new TreeNode(2);
		root.right = new TreeNode(22);
		root.right.right = new TreeNode(63);
		root.right.right.right = new TreeNode(84);
		SearchInABinarySearchTree_700 test = new SearchInABinarySearchTree_700();
		
		TreeNode node = test.searchBST(root, 63);
		System.out.println(node.val);
		
	}
	
	public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
		
		return traversal(queue, val);
    }
    
    public TreeNode traversal(Queue<TreeNode> queue, int val) {
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		for(int i=0;i<size;i++) {
    			TreeNode node = queue.poll();
    			if(node.val==val)
    				return node;
    			if(node.left!=null) queue.offer(node.left);
    			if(node.right!=null) queue.offer(node.right);
    		}
    	}
        return null;
    }
}

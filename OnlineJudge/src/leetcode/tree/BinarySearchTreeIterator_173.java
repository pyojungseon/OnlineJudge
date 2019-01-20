package leetcode.tree;

import java.util.Stack;

public class BinarySearchTreeIterator_173 {

	/*
	 * 이진탐색트리에서 inorder의 순으로 탐색하게 되면 기본적으로 크기순으로 나열
	 * 이를 조금만 변형시켜, 최초 stack에 맨 왼쪽트리까지의 탐색을 넣어놓고
	 * 오른쪽 노드가 존재하면 그 오른쪽 노드에서 다시 맨 왼쪽트리까지를 탐색. 이를 반복
	 * */
	Stack<TreeNode> stack = new Stack<>();
    public BinarySearchTreeIterator_173(TreeNode root) {
        if(root!=null) {
            stack.push(root);
            while(root.left!=null) {
                root=root.left;
                stack.push(root);
            }
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int ret = node.val;
        if(node.right!=null) {
            stack.push(node.right);
            node=node.right;
            while(node.left!=null) {
                node=node.left;
                stack.push(node);
            }
        }
        return ret;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size()>0;
    }
}

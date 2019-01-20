package leetcode.stackqueue;

import java.util.Stack;

public class MinStack_155 {

	class Node {
        int val;
        int min;
        public Node(int val, int min) {
            this.val=val;
            this.min=min;
        }
    }
    
    Stack<Node> s = new Stack<>();
    
    public MinStack_155() {
        
    }
    
    public void push(int x) {
        int min;
        if(s.size()>0) {
            min = s.peek().min>x?x:s.peek().min;
        } else {
            min=x;
        }
        Node node = new Node(x, min);
        s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().val;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

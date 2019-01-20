package leetcode.stackqueue;

import java.util.Stack;

public class ImplementQueueusingStacks_232 {

	/*
	 * 스택를 이용한 큐만들기. 간단하다
	 * LIFO인 스택을 2번 넣으면 원래 순서로 정렬되므로
	 * 스택을 2개 이용하여 꺼내줄때 위치를 재정렬해주기
	 * */
	
	public Stack<Integer> input = new Stack<>();
    public Stack<Integer> output = new Stack<>();
    
    public ImplementQueueusingStacks_232() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);    
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(output.size()==0) {
            while(input.size()>0) {
            output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.size()==0 && output.size()==0;
    }
}

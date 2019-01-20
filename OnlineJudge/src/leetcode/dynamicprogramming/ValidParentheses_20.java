package leetcode.dynamicprogramming;

import java.util.Stack;

public class ValidParentheses_20 {
	/*
	 * dp로 풀기.
	 * 각 괄호가 닫힐 때에 유효하는 길이를 저장. 이전 길이를 dp로 계속 누적하여 더하기
	 * */
	
	
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charString = s.toCharArray();
        for(char a : charString) {
            if(a=='('||a=='{'||a=='[') {
                stack.push(a);
            }
            else if(a==')') {
                if(stack.size()==0 || stack.pop()!='(') {
                    return false;
                }
            }
            else if(a=='}') {
                if(stack.size()==0 ||stack.pop()!='{') {
                    return false;
                }
            }
            else if(a==']') {
                if(stack.size()==0 ||stack.pop()!='[') {
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}

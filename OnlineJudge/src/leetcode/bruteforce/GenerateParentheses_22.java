package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        char[] parenthesis = new char[n*2];
        recursion(ret, parenthesis, 0, n);
        return ret;
    }
    
    public void recursion(List<String> ret, char[] parenthesis, int n, int length) {
        if(length*2==n) {
            ret.add(new String(parenthesis));
            return;
        }
        if(isPossibleOpen(parenthesis, length, n)) {
            parenthesis[n]='(';
            recursion(ret, parenthesis, n+1, length);
        }
        if(isPossibleClose(parenthesis, n)) {
            parenthesis[n]=')';
            recursion(ret, parenthesis, n+1, length);
        }
    } 
    
    public boolean isPossibleOpen(char[] parenthesis, int length, int n) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(parenthesis[i]=='(')
                count++;
        }
        if(count<length)
            return true;
        return false;
    }
    
    public boolean isPossibleClose(char[] parenthesis, int n) {
        int open=0, close=0;
        for(int i=0;i<n;i++) {
            char c = parenthesis[i];
            if(c=='(')
                open++;
            if(c==')')
                close++;
        }
        if(close>=open)
            return false;
        return true;
    }
}

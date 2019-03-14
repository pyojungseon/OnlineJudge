package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_784 {

	public List<String> letterCasePermutation(String S) {
        List<String> ret = new ArrayList<>();
        if(S.length()==0) {
            ret.add(new String());
            return ret;
        }
        char[] str = new char[S.length()];
        traversal(S, str, ret, 0);
        
        
        return ret;
    }
    
    public void traversal(String s, char[] str, List<String> ret, int idx) {
        if(idx==s.length()) {
            ret.add(new String(str));
            return;
        }
        
        if((int)s.charAt(idx)>=65 &&
          (int)s.charAt(idx)<=122) {
            str[idx] = s.toLowerCase().charAt(idx);
            traversal(s, str, ret, idx+1);
            str[idx] = s.toUpperCase().charAt(idx);
            traversal(s, str, ret, idx+1);
        } else {
            str[idx] = s.charAt(idx);
            traversal(s, str, ret, idx+1);
        }
    }
}

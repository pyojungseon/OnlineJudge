package leetcode.bruteforce;

public class LongestPalindromicSubstring_5 {

	int point=0, maxLength=0;
    
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++) {
            isPalindrome(s, i, i);
            isPalindrome(s, i, i+1);
        }
        
        return s.substring(point, maxLength+point);
    }
    
    public void isPalindrome(String s, int before, int after) {
        while(before>=0 && after<s.length() && s.charAt(before)==s.charAt(after)) {
            before--;
            after++;
        }
        if(maxLength<after-before-1) {
            point=before+1;
            maxLength=after-before-1;
        }
    }
}

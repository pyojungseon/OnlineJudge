public class Palindrome {
    public boolean isPalindrome(int x) {
        String pal = Integer.toString(x);
        for(int i=0;i<pal.length()/2;i++) {
            if(pal.charAt(i)!=pal.charAt(pal.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}

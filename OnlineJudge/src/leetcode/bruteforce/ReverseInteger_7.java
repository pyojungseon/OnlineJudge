package leetcode.bruteforce;

public class ReverseInteger_7 {

	public int reverse(int x) {
        boolean minus = false;
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        int end=0;
        int length = str.length();
        if(str.contains("-")) {
            sb.append("-");
            end++;
            str.replace("-", "");
        }
        for(int i=str.length()-1;i>=end;i--) {
            sb.append(str.substring(i, i+1));
        }
        try {
           x= Integer.valueOf(sb.toString());
         
        } catch  (Exception e) {
            return 0;
        }
        
        return x;
    }
}

import java.util.HashMap;

public class RomanToInteger {
    private static final Map<Character, Integer> hm = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private static int romanToInt(String s) {

        int point = s.length()-1;
        int sum = 0;
        while(point>0) {
            int n = hm.get(String.valueOf(s.charAt(point)));
            int m = hm.get(String.valueOf(s.charAt(point - 1)));
            if (n > m) {
                sum = sum + n - m;
                point--;
            } else {
                sum = sum + n;
            }
            point--;
        }
        if(point==0) { sum = sum + hm.get(String.valueOf(s.charAt(0))); }
        return sum;
    }
}

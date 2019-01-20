package leetcode.dynamicprogramming;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	/*
	 * dp를 이용. hash map에 값/포인터 맵을 담아놓고 이전에 있는 값이면 포인터를 갱신
	 * 가장 긴 길이를 최종적으로 리턴 
	 * */
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int start=0, max=0;
        
        if(s.length()==0)
            return 0;
        
        for(int i=0;i<s.length();i++) {
            if(hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i))>=start) {
                start=hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i),i);
            }
            else {
                hm.put(s.charAt(i), i);
                max=Math.max(i-start+1,max);
            }
        }
        return max;
    }
}

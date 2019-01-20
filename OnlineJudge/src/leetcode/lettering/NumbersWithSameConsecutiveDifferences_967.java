package leetcode.lettering;

import java.util.ArrayList;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences_967 {
	
	char[] number;
	/*
	 * Input: N = 3, K = 7
	 * Output: [181,292,707,818,929]
	 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
	 */
	public int[] numsSameConsecDiff(int N, int K) {
		number = new char[N];
		List<Integer> numList = new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			number[0]=Integer.toString(i).charAt(0);
			traversal(N, K, numList);
		}
		
		
		int[] ret = new int[numList.size()];
		for(int i=0;i<numList.size();i++) {
			ret[i]=numList.get(i);
		}
		return ret;
    }
	
	public void traversal(int N, int K, List<Integer> list) {
		if(N==0) {
			list.add(Integer.valueOf(number.toString()));
		}
		else {
			/*number[K] = K;
			
			if(j+K<10) {
				number[K] = j+K;
				traversal(N-1, K, list);
			}
			if(j-K>=0) {
				number[K] = j-K;
				traversal(N-1, K, list);
			}*/
		}
	}
}

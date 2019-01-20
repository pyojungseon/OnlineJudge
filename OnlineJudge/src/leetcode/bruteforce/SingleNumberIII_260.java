package leetcode.bruteforce;

public class SingleNumberIII_260 {

	/*
	 * xor을 이용하여 남은 숫자 하나만을 찾아내기
	 * 2개의 숫자는 xor을 사용할 경우 0이 됨
	 * 
	 * */
	
	public int[] singleNumber(int[] nums) {
        int[] ret = new int[2];
        int xor=0, xor1=0;
        int depth=0;
        for(int num:nums) {
            xor ^= num;
        }
        for(int i=0;i<32;i++) {
            if(((xor>>i)&1)==1) {
                depth=i;
                break;
            }
        }
        xor=0;
        for(int num:nums) {
            if(((num>>depth)&1)==1) {
                xor ^= num;
            } else {
                xor1 ^= num;
            }
        }
        ret[0] = xor;
        ret[1] = xor1;
        return ret;
    }
}

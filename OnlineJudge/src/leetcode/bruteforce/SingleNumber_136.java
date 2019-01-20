package leetcode.bruteforce;

public class SingleNumber_136 {

	public int singleNumber(int[] nums) {
        int ret=0;
        for(int num : nums) {
            ret ^= num;
        }
        return ret;
    }
}

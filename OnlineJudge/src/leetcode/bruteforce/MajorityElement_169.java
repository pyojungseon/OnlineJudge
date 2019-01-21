package leetcode.bruteforce;

public class MajorityElement_169 {

	/*
	 * 
	 * */
	public int majorityElement(int[] nums) {
        int element=0, count=0;
        
        for(int num : nums) {
            if(count==0) {
                element=num;
                count++;
            } else if(element==num) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}

package leetcode.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(target-nums[i])) {
                ret[0]=hm.get(target-nums[i]);
                ret[1]=i;
                i=nums.length;
            } else {
                hm.put(nums[i], i);
            }
        }
        return ret;
    }
}

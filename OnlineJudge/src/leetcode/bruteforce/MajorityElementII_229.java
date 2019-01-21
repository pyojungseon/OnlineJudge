package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII_229 {

	public List<Integer> majorityElement(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int num1=0, num2=0, cnt1=0, cnt2=0;
        for(int num : nums) {
            if(num1==num) {
                cnt1++;
            } else if(num2==num) {
                cnt2++;
            } else if(cnt1==0) {
                num1=num;
                cnt1++;
            } else if(cnt2==0) {
                num2=num;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int num:nums) {
            if(num==num1)
                cnt1++;
            else if(num==num2)
                cnt2++;
        }
        if(cnt1>(nums.length/3))
            ret.add(num1);
        if(cnt2>(nums.length/3))
            ret.add(num2);
        
        return ret;
    }
}

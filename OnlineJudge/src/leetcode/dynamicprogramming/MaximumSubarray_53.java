package leetcode.dynamicprogramming;

public class MaximumSubarray_53 {

	public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int ret=0;
        if(nums.length==0)
            return ret;
        
        dp[0]=nums[0];
        ret=nums[0];
        
        for(int i=1;i<nums.length;i++) {
            int max = Math.max(nums[i], dp[i-1]+nums[i]);
            dp[i]=max;
            ret = Math.max(ret, max);
        }
        
        return ret;
    }
}

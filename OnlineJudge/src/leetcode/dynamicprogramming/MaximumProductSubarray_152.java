package leetcode.dynamicprogramming;

public class MaximumProductSubarray_152 {

	public int maxProduct(int[] nums) {
        int ret=0;
        if(nums.length==0)
            return ret;
        
        int[][] dp = new int[nums.length][2];
        dp[0][0]=Math.max(0, nums[0]);
        dp[0][1]=Math.min(0, nums[0]);
        ret=nums[0];
        
        for(int i=1;i<nums.length;i++) {
            dp[i][0]=Math.max(0, Math.max(dp[i-1][0]*nums[i], Math.max(nums[i], dp[i-1][1]*nums[i])));
            dp[i][1]=Math.min(0, Math.min(dp[i-1][0]*nums[i], Math.min(nums[i], dp[i-1][1]*nums[i])));
            
            ret = Math.max(dp[i][0], ret);
        }
        return ret;
    }
}

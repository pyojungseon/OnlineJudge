package leetcode.dynamicprogramming;

public class LongestIncreasingSubsequence_300 {

	public int lengthOfLIS(int[] nums) {
        int ret=0;
        if(nums.length==0)
            return ret;
        else if(nums.length==1)
            return ret+1;
        int dp[] = new int[nums.length];
        int max=0;
        dp[0]=1;
        
        for(int i=1;i<nums.length;i++) {
            max=-1;
            for(int j=0;j<i;j++) {
                if(nums[i]>nums[j]) {
                    if(max!=-1 && dp[j]>dp[max])
                    max=j;
                    else if(max==-1)
                        max=j;
                }
            }
            if(max==-1)
                dp[i]=1;
            else
                dp[i]=dp[max]+1;
            if(dp[i]>ret)
                ret = dp[i];
        }
        return ret;
    }
}

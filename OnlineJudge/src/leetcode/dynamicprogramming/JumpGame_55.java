package leetcode.dynamicprogramming;

public class JumpGame_55 {

	public boolean canJump(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0]=1;
        if(length<=1)
            return true;
        for(int i=1;i<length;i++) {
            for(int j=i-1;j>=0;j--) {
                if((i-j)<=nums[j] && dp[j]==1) {
                    dp[i]=1;
                    break;
                }
            }
        }
        if(dp[length-1]==1) {
            return true;
        } else {
            return false;
        }
    }
}

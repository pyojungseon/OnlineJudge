package leetcode.dynamicprogramming;

public class MinimumPathSum_64 {

	public int minPathSum(int[][] grid) {
        int width=grid.length;
        int height=grid[0].length;
        
        if(width==0 || height==0) {
            return 0;
        }
        
        int[][] dp = new int[width][height];
        dp[0][0]=grid[0][0];
        
        for(int i=1;i<width;i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<height;i++) {
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        for(int i=1;i<width;i++) {
            for(int j=1;j<height;j++) {
                dp[i][j] = Math.min(dp[i-1][j]+grid[i][j], dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[width-1][height-1];
    }
}

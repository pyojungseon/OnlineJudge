package leetcode.dynamicprogramming;

public class UniquePathsII_63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid[0].length;
        int m=obstacleGrid.length;
        
        if(n==1 || m==1) {
            for(int[] a : obstacleGrid) {
                for(int b : a) {
                    if(b==1)
                        return 0;
                }
                
            }
            return 1;
        }
        
        int[][] maze = new int[m][n];
        
        if(obstacleGrid[0][0]==0)
            maze[0][0]=1;
        for(int i=1;i<n;i++) {
            if(obstacleGrid[0][i]==0)
                maze[0][i]=maze[0][i-1];
        }
        for(int i=1;i<m;i++) {
            if(obstacleGrid[i][0]==0)
                maze[i][0]=maze[i-1][0];
        }
        
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                int a=0, b=0;
                if(obstacleGrid[i-1][j]==0)
                    a=maze[i-1][j];
                if(obstacleGrid[i][j-1]==0)
                    b=maze[i][j-1];
                
                if(obstacleGrid[i][j]==0) {
                    maze[i][j]=a+b;
                } else {
                    maze[i][j]=0;
                }
            }
        }
        return maze[m-1][n-1];
    }
}

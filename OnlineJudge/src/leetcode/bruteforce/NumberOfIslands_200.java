package leetcode.bruteforce;

public class NumberOfIslands_200 {

	public int numIslands(char[][] grid) {
        int numOfIsland=0;
       if(grid==null ||
         grid.length==0 ||
         grid[0].length==0)
           return numOfIsland;
       
       int height=grid.length;
       int width=grid[0].length;
       
       for(int i=0;i<height;i++) {
           for(int j=0;j<width;j++) {
               if(grid[i][j]=='1') {
                   numOfIsland++;
                   dfs(grid, i, j);
               }
           }
       }
       return numOfIsland;
   }
   
   public void dfs(char[][] grid, int i, int j) {
       if(grid[i][j]=='1') grid[i][j]=2;
       
       if(i-1>=0 && grid[i-1][j]=='1')
           dfs(grid, i-1, j);
       
       if(i+1<grid.length && grid[i+1][j]=='1')
           dfs(grid, i+1, j);
       if(j-1>=0 && grid[i][j-1]=='1')
           dfs(grid, i, j-1);
       if(j+1<grid[0].length && grid[i][j+1]=='1') dfs(grid, i, j+1);
   }
}

package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class PossibleBipartition_886 {

	public boolean possibleBipartition(int N, int[][] dislikes) {
        boolean[] colored = new boolean[N];
        boolean[] visited = new boolean[N];
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<N;i++) {
            adjList.add(new ArrayList<>());
        }
        for(int[] num : dislikes) {
            int a = num[0]-1;
            int b = num[1]-1;
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }
        
        for(int i=0;i<N;i++) {
            if(!traversal(i, adjList, colored, visited))
                return false;
        }
        
        return true;
    }
    
    public boolean traversal(int N, List<List<Integer>> dislikes, boolean[] colored, boolean[] visited) {
        for(int next : dislikes.get(N)) {
            if(!visited[next]) {
                visited[next]=true;
                colored[next]=!colored[N];
                if(!traversal(next, dislikes, colored, visited))
                    return false;
            } else {
                if(colored[next]==colored[N])
                    return false;
            }
        }
        return true;
    }
}

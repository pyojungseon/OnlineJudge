package leetcode.topology;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule_207 {

	/*
	 * indegree를 이용하는 방법 / bfs로 탐색하는 방법
	 * indegree : 노드의 기준에서 들어오는 엣지의 갯수를 저장
	 * 1. 최초 indegree가 0인 노드에서 시작
	 * 2. 각각의 노드와 엣지를 제거해가며 탐색
	 * 3. 모든 탐색이 끝나면 사이클이 없이 정상.
	 * */
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Set<Integer> visited = new HashSet<>();
        for(int[] line : prerequisites) {
            indegree[line[0]]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i]==0) {
                que.add(i);
            }
        }
        if(que.size()==0)
            return false;
        while(que.size()>0) {
            int node = que.poll();
            visited.add(node);
            for(int[] line : prerequisites) {
                if(line[1]==node) {
                    indegree[line[0]]--;
                    if(indegree[line[0]]==0)
                        que.add(line[0]);
                }
            }
        }
        return visited.size()==numCourses;
    }
}

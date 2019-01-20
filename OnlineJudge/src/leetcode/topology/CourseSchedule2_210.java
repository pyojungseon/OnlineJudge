package leetcode.topology;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2_210 {

	/*
	 * indegree를 이용하는 방법 / bfs로 탐색하는 방법
	 * indegree : 노드의 기준에서 들어오는 엣지의 갯수를 저장
	 * 1. 최초 indegree가 0인 노드에서 시작
	 * 2. 각각의 노드와 엣지를 제거해가며 탐색
	 * 3. 모든 탐색이 끝나면 사이클이 없이 정상.
	 * */
	
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] node : prerequisites) {
            indegree[node[0]]++;
        }
        for(int i=0;i<numCourses;i++) {
            if(indegree[i]==0) {
                que.add(i);
                list.add(i);
            }
        }
        
        while(que.size()>0) {
            int val = que.poll();
            for(int[] node : prerequisites) {
                if(node[1]==val) {
                    indegree[node[0]]--;
                    if(indegree[node[0]]==0) {
                        que.add(node[0]);
                        list.add(node[0]);
                    }
                }
            }
        }
        if(list.size()!=numCourses) {
            return new int[0];
        }
        int[] ret = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            ret[i]=list.get(i);
        }
        return ret;
    }
}

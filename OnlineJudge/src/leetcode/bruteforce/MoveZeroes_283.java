package leetcode.bruteforce;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes_283 {

	public void moveZeroes(int[] nums) {
        Queue<Integer> que = new LinkedList<>();
        if(nums.length<=1)
            return;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0)
                que.add(i);
            else {
                if(!que.isEmpty()) {
                    int point = que.poll();
                    nums[point]=nums[i];
                    nums[i]=0;
                    que.add(i);
                }
            }
        }
    }
}

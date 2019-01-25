package leetcode.stackqueue;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {

	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int num : nums) {
            if(pq.size()==k) {
                if(pq.peek()<num) {
                    pq.poll();
                    pq.add(num);
                }
            } else {
                pq.offer(num);
            }
        }
        return pq.peek();
    }
}

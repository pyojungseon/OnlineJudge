package leetcode.stackqueue;

import java.util.PriorityQueue;

public class MergeKSortedLists_23 {

	public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        if(lists.length==0) return null;
        
        for(ListNode node : lists) {
            while(node!=null) {
                pq.offer(node.val);
                node=node.next;
            }
        }
        if(pq.size()==0) return null;
        ListNode ret = new ListNode(pq.poll());
        ListNode a = ret;
        while(!pq.isEmpty()) {
            ret.next = new ListNode(pq.poll());
            ret=ret.next;
        }
        
        return a;
    }
}

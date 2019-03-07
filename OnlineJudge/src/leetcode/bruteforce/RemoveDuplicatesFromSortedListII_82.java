package leetcode.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedListII_82 {

	public class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode node = head;
        Map<Integer, Integer> hm = new HashMap<>();
        while(node!=null) {
            if(hm.containsKey(node.val)) hm.put(node.val, 2);
            else
                hm.put(node.val, 1);
            node=node.next;
        }
        ListNode ret = new ListNode(0);
        node=ret;
        while(head!=null) {
            if(hm.get(head.val)==1) {
                
                node.next = new ListNode(head.val);
                node=node.next;
            }
            head=head.next;
        }
        
        return ret.next;
    }
}

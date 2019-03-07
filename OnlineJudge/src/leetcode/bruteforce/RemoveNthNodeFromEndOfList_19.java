package leetcode.bruteforce;

public class RemoveNthNodeFromEndOfList_19 {

	public class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second=head;
        for(int i=0;i<n;i++) {
            if(first.next!=null) first=first.next;
            else
                return head.next;
        }
        while(first.next!=null) {
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
    
        return head;
    }
}

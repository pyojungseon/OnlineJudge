package leetcode.bruteforce;

public class SwapNodesInPairs_24 {

	public class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode node = head;
        ListNode prev=head;
        ListNode temp=head;
        
        while(node!=null && node.next!=null) {
            
            temp = node.next;
            node.next=temp.next;
            temp.next=node;
            
            if(node!=head) {
                prev.next=temp;
            } else {
                head=temp;
            }
            prev=node;
            node=node.next;
        }
        return head;
    }
}

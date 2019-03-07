package leetcode.bruteforce;

public class RemoveDuplicatesFromSortedList_83 {

	public class ListNode {
		int val;
		ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode node = new ListNode(head.val);
        ListNode ret = node;
        
        while(head!=null) {
            if(node.val!=head.val) {
                node.next=new ListNode(head.val);
                node=node.next;

            }
            head=head.next;
        }
        
        return ret;
    }
}

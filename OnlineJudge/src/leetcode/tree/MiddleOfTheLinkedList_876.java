package leetcode.tree;

public class MiddleOfTheLinkedList_876 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode middleNode(ListNode head) {
        return traversal(head,head);
    }
    
    public ListNode traversal(ListNode walker, ListNode runner) {
        if(walker!=null) {
            while(runner.next!=null) {
                runner=runner.next;
                walker=walker.next;
                    
                if(runner.next!=null) {
                    runner=runner.next;
                }
            }
        }
        return walker;
    }
}

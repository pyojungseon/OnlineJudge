package leetcode.bruteforce;

public class MergeTwoSortedLists_21 {
	
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	 

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = null;
        ListNode cur = new ListNode(0);
        
        while(l1!=null || l2!=null) {
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            
            if(l1!=null) {
                left=l1.val;
            }
            if(l2!=null) {
                right=l2.val;
            }
            
            if(left<=right) {
                cur.next=new ListNode(left);
                l1=l1.next;
            }
            else {
                cur.next=new ListNode(right);
                l2=l2.next;
            }
            if(ret==null) ret=cur.next;
            cur=cur.next;
        }
        
        return ret;
    }
}

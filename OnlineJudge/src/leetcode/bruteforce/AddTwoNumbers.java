package leetcode.bruteforce;

public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ret=dummy;
        int carry=0,num1=0,num2=0;
        
        while(l1!=null || l2!=null || carry!=0) {
            num1 = (l1==null) ? 0 : l1.val;
            num2 = (l2==null) ? 0 : l2.val;
            ret.next = new ListNode((num1+num2+carry)%10);
            ret=ret.next;
            if((num1+num2+carry)>=10) {
                carry=1;
            } else {
                carry=0;
            }
            
            l1=(l1==null) ? null : l1.next;
            l2=(l2==null) ? null : l2.next;
        }
        
        return dummy.next;
    }
}

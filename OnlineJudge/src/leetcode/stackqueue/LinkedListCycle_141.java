package leetcode.stackqueue;

public class LinkedListCycle_141 {

	/*
	 * 링크드리스트가 cycle인지 확인
	 * walker and runner 기법
	 * 노드를 한개씩 탐색하는 walker
	 * 노드를 2개씩 탐색하는 runner
	 * 이 둘이 만난다면 이는 cycle이다. -> O(N)으로 탐색가능
	 * */
	
	public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        if(head==null || head.next==null)
            return false;
        while(runner.next!=null) {
            runner = runner.next;
            if(runner.next!=null) {
                walker = walker.next;
                runner = runner.next;
                if(runner==walker)
                    return true;
            }
        }
        return false;
    }
}

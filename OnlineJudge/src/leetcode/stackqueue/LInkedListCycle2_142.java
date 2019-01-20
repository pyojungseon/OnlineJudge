package leetcode.stackqueue;

public class LInkedListCycle2_142 {

	/*
	 * walker and runner 기법
	 * cycle이 있다면 결국 walker와 runner는 
	 * 첫노드부터 cycle이 시작되는 위치만큼의 거리가 모자란 지점에서 만난다
	 * xxxxx
	 *   x x
	 *   xxx
	 * 워커와 러너가 만나는 지점은 사이클이 있다면 워커가 1바퀴 돌때 러너가 2바퀴 돌아 만난다
	 * 그러나 시작부터 사이클이 아니라면, 사이클이 시작하는 지점 기준으로 루트 노드 까지의 거리만큼
	 * 덜 돌은것과 같으므로 러너와 워커가 둘이 만나는 그 지점과
	 * 루트에서 새로 시작한 노드가 만났을 때 그 지점이 시작지점이다. 
	 * */
	public ListNode detectCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        
        if(head==null)
            return null;
        
        while(runner.next!=null) {
            runner=runner.next;
            if(runner.next!=null) {
                runner=runner.next;
                walker=walker.next;
            }
            if(runner==walker)
                break;
        }
        if(runner.next==null)
            return null;
        
        ListNode checker = head;
        while(checker!=walker) {
            checker=checker.next;
            walker=walker.next;
        }
        return checker;
    }
}

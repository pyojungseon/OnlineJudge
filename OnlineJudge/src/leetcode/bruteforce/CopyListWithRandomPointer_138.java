package leetcode.bruteforce;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_138 {

	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null) return null;
        
        Map<RandomListNode, RandomListNode> hm = new HashMap<>();
        RandomListNode ret = new RandomListNode(head.label);
        RandomListNode cur = ret;
        
        while(head!=null) {
            if(head.next!=null) {
                if(!hm.containsKey(head.next)) {
                    hm.put(head.next, new RandomListNode(head.next.label));
                }
                cur.next=hm.get(head.next);                
            }
            if(head.random!=null) {
                if(!hm.containsKey(head.random)) {
                    hm.put(head.random, new RandomListNode(head.random.label));
                }
                cur.random=hm.get(head.random);
            }
            cur=cur.next;
            head=head.next;
        }
        
        return ret;
    }
}

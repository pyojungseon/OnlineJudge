package leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LRUCache_146 {

	public class CacheVo {
        int key;
        int value;
        CacheVo prev;
        CacheVo next;
        
        public CacheVo(int key, int value) {
            this.key=key;
            this.value=value;
        }
    }
    
    int capacity;
    CacheVo head;
    CacheVo tail;
    Map<Integer, CacheVo> map;
    
    public LRUCache_146(int capacity) {
        this.capacity=capacity;
        head=null;
        tail=null;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        } else {
            CacheVo cache = map.get(key);
            if(cache!=head) {
                if(cache==tail) {
                    tail=tail.prev;
                }
                if(cache.prev!=null)
                    cache.prev.next=cache.next;
                if(cache.next!=null)
                    cache.next.prev=cache.prev;
                
                head.prev=cache;
                cache.next=head;
                head=cache;
            }
            
            return cache.value;
        }
    }
    
    public void put(int key, int value) {
        if(get(key)==-1) {
            CacheVo cache = new CacheVo(key, value);
            if(map.size()==0) {
                head=cache;
                tail=cache;
            } else {
                head.prev=cache;
                cache.next=head;
                head=cache;
            }
            map.put(key, cache);
        } else {
            map.get(key).value=value;
        }
        if(map.size()>capacity) {
            map.remove(tail.key);
            tail=tail.prev;
            tail.next=null;
        }
    }
}

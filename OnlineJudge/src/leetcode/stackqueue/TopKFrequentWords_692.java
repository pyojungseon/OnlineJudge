package leetcode.stackqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords_692 {

	public class WordCnt{
        int  cnt;
        String word;
        public WordCnt(String word) {
            this.word=word;
            this.cnt=1;
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ret = new ArrayList<>();
        if(words.length==0)
            return ret;
        
        PriorityQueue<WordCnt> pq = new PriorityQueue<>(k, new Comparator<WordCnt>() {
            @Override
            public int compare(WordCnt o1, WordCnt o2) {
                if(o1.cnt==o2.cnt)
                    return o2.word.compareTo(o1.word);
                return o1.cnt-o2.cnt;
            }
        });
        
        Map<String, WordCnt> hm = new HashMap<>();
        
        for(String word : words) {
            if(hm.containsKey(word)) {
                hm.get(word).cnt++;
            } else {
                WordCnt wordCnt = new WordCnt(word);
                hm.put(word, wordCnt);
            }
            
        }
        
        for(String key : hm.keySet()) {
            pq.offer(hm.get(key));
            if(pq.size()>k)
                pq.poll();
        }
        
        while(!pq.isEmpty()) {
            ret.add(0, pq.poll().word);
        }
        
        return ret;
    } 
}

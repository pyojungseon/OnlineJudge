package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56 {

	public class Interval {
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<>();
        if(intervals.size()==0) return ret;
        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        
        for(int i=1;i<intervals.size();i++) {
            Interval front = intervals.get(i-1);
            Interval rear = intervals.get(i);
            
            if(front.start<=rear.end && rear.start<=front.end) {
                rear.start = Math.min(front.start, rear.start);
                rear.end = Math.max(front.end, rear.end);
            } else {
                ret.add(intervals.get(i-1));
            }
        }
        ret.add(intervals.get(intervals.size()-1));
        return ret;
    }
}

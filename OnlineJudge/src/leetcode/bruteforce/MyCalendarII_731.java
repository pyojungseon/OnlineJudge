package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarII_731 {

	public class DateVo{
        int start;
        int end;
        List<DateVo> dupList;
        public DateVo(int start, int end) {
            this.start=start;
            this.end=end;
            dupList = new ArrayList<>();
        }
    }
    
    List<DateVo> list;
        
    public MyCalendarII_731() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(!list.isEmpty()) {
            for(DateVo single : list) {
                if(single.start<end && single.end>start) {
                    int startArea = Math.max(single.start, start);
                    int endArea = Math.min(single.end, end);
                    if(!single.dupList.isEmpty()) {
                        for(DateVo dup : single.dupList) {
                            if(dup.start<endArea && dup.end>startArea) {
                                return false;
                            }
                        }
                    }
                }
            }
            for(DateVo single : list) {
                if(single.start<end && single.end>start) {        single.dupList.add(new DateVo(start, end));
                                                          }
            }
        }
        list.add(new DateVo(start, end));
        return true;
        
    }
}

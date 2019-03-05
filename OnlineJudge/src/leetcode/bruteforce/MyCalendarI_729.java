package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarI_729 {

	public class DateVo {
        int start;
        int end;
        public DateVo(int start, int end) {
            this.start=start;
            this.end=end;
        }
    }
    
    List<DateVo> list;
        
    public MyCalendarI_729() {
        list=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(!list.isEmpty()) {
            for(DateVo single : list) {
                if(single.start<end && single.end>start) {
                    return false;
                }
            }
        }
        list.add(new DateVo(start, end));
        return true;
    }
}

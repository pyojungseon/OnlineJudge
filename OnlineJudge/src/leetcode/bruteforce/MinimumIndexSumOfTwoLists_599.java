package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists_599 {

	public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        int min=9999;
        
        for(int i=0;i<list1.length;i++) {
            hm.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++) {
            if(hm.containsKey(list2[i])) {
                int num = hm.get(list2[i])+i;
                hm2.put(list2[i], num);
                if(num<min)
                    min=num;
            }
        }
        List<String> retlist = new ArrayList<>();
        for(String key : hm2.keySet()) {
            if(hm2.get(key)==min) {
                retlist.add(key);
            }
        }
        String[] ret = new String[retlist.size()];
        retlist.toArray(ret);
        return ret;
    }
}

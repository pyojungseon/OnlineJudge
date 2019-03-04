package leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomO_380 {

	public class RandomizedSet {

	    /** Initialize your data structure here. */
	    Map<Integer, Integer> hm;
	    List<Integer> list;
	    Random r = new Random();
	    
	    public RandomizedSet() {
	        hm=new HashMap<>();
	        list = new ArrayList<>();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(hm.containsKey(val)) return false;
	        hm.put(val, list.size());
	        list.add(val);
	        return true;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if(!hm.containsKey(val)) return false;
	        int point=hm.get(val);
	        if(point!=list.size()-1) {
	            int swap = list.get(list.size()-1);
	            list.set(list.size()-1, list.get(point));
	            list.set(point, swap);
	            hm.put(list.get(point), point);
	        }
	        hm.remove(val);
	        list.remove(list.size()-1);
	        return true;
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	        if(list.size()==1)
	            return list.get(0);
	        return list.get(r.nextInt(list.size()));
	    }
	}
	
	public static void main(String[] args) {
		InsertDeleteGetRandomO_380 test = new InsertDeleteGetRandomO_380();
		test.randomset();
		
	}
	
	public void randomset() {
		RandomizedSet set = new RandomizedSet();
		set.insert(1);
		set.insert(10);
		set.insert(20);
		set.insert(30);
		for(int i=0;i<30;i++) {
			System.out.println(set.getRandom());
		}
	}
	
}

package leetcode.permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PermutationsII_47 {

	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if(nums.length==0) return ret;
        
        List<Integer> permutation = new ArrayList<>();
        boolean[] idxList = new boolean[nums.length];
        Set<List<Integer>> set = new HashSet<>();
        
        permute(nums, 0, permutation, set, idxList);
        
        Iterator<List<Integer>> it = set.iterator();
        while(it.hasNext()) {
            ret.add(it.next());
        }
        
        return ret;
    }
    
    public void permute(int[] nums, int idx, List<Integer> permutation, Set<List<Integer>> set, boolean[] idxList ) {
        if(idx==nums.length) {
            set.add(new ArrayList<>(permutation));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(!idxList[i]) {
                idxList[i]=true;
                permutation.add(nums[i]);
                permute(nums, idx+1, permutation, set, idxList);
                permutation.remove(permutation.size()-1);
                idxList[i]=false;
            }
        }
    }
}

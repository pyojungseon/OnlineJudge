package leetcode.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        if(nums.length==0)
            return null;
        traversal(nums, ret, numList);
        return ret;
    }
    
    public void traversal(int[] nums, List<List<Integer>> ret, List<Integer> numList) {
        for(int num : nums) {
            if(numList.contains(num))
                continue;
            numList.add(num);
            if(numList.size()==nums.length) {
                ret.add(new ArrayList<Integer>(numList));
            } else {
                traversal(nums, ret, numList);
            }
            numList.remove(numList.size()-1);
        }
    }
}

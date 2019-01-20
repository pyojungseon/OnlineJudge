package leetcode.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays_4 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length-1;
        int row1=0, row2=0;
        
        List<Double> list = new ArrayList<Double>();
        for(int i=0;i<=length;i++) {
            if(row2>nums2.length-1 || nums2.length==0) {
                list.add((double) nums1[row1]);
                row1++;
            } else if(row1>nums1.length-1 || nums1.length==0) {
                list.add((double)nums2[row2]);
                row2++;
            }
            else if(nums1[row1]<nums2[row2]) {
                list.add((double)nums1[row1]);
                row1++;
            } else {
                list.add((double)nums2[row2]);
                row2++;
            }
        }

        if(length%2==0) {
            return list.get(length/2);
        }
        else {
            return (list.get(length/2)+list.get((length/2)+1))/2; 
        }
    }
}

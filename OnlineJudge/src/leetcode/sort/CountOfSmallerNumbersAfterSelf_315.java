package leetcode.sort;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf_315 {

int idx[];
    
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        if(nums.length==0) return ret;
        
        int[] count = new int[nums.length];
        idx = new int[nums.length];
        for(int i=0;i<idx.length;i++) {
            idx[i]=i;
        }
        
        mergeSort(nums, count, 0, nums.length-1);
        
        for(int a : count)
            ret.add(a);
        
        return ret;
    }
    
    public void mergeSort(int[] arr, int[] count, int low, int high) {
        if(high<=low) return;
        int mid = (low+high)/2;
        mergeSort(arr, count, low, mid);
        mergeSort(arr, count, mid+1, high);
        merge(arr, count, low, mid, high);
    }
    
    public void merge(int[] arr, int[] count, int low, int mid, int high) {
        int l=low, h=mid+1, t=0, smallCount=0;
        int[] temp = new int[high-low+1];
        int[] tempIdx = new int[idx.length];
        
        while(l<=mid && h<=high) {
            if(arr[l]<=arr[h]) {
                tempIdx[t] = idx[l];
                count[tempIdx[t]]=count[tempIdx[t]]+smallCount;
                temp[t++] = arr[l++];
            }
            else {
                smallCount++;
                tempIdx[t] = idx[h];
                temp[t++] = arr[h++];
            }
        }
        while(l<=mid) {
            tempIdx[t] = idx[l];
            count[tempIdx[t]]=count[tempIdx[t]]+smallCount;
            temp[t++] = arr[l++];
        }
        while(h<=high) {
            tempIdx[t] = idx[h];
            temp[t++] = arr[h++];
        }
        for(int i=low;i<=high;i++) {
            idx[i] = tempIdx[i-low];
            arr[i] = temp[i-low];
        }
        
    }
}

package leetcode.dynamicprogramming;

public class ContainerWithMostWater_11 {

	public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int l=right, h=(height[left]>height[right]) ? height[right]:height[left];
        int max=l*h;
        
        while(left!=right) {
            if(height[right]<height[left]) {
                right--;
            } else {
                left++;
            }
            h=(height[left]<height[right]) ? height[left] : height[right];
            l=right-left;
            max=((l*h)>max) ? l*h : max;
        }
        return max;
    }
}

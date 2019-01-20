package leetcode.dynamicprogramming;

public class TrappingRainWater_42 {

	public int trap(int[] wall) {
        int square=0;
        int length = wall.length;
        if(length==0)
            return 0;
        int leftMax=wall[0];
        int rightMax=wall[length-1];
        int squareSum[] = new int[length];
        for(int i=1;i<length;i++) {
            if(wall[i]>leftMax) {
                leftMax = wall[i];
            } else {
                squareSum[i] = leftMax-wall[i];
            }
        }
        for(int i=length-1;i>0;i--) {
            if(wall[i]>rightMax) {
                rightMax = wall[i];
                squareSum[i]=0;
            } else {
                squareSum[i] = Math.min(rightMax-wall[i], squareSum[i]);
            }
        }
        for(int i=1;i<length;i++) {
            square += squareSum[i];
        }
        return square;
    }
}

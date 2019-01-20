package leetcode.permutation;

public class NextPermutation_31 {

	/*
	 * 1 3 5 4 4
	 * 1. 맨 오른쪽에서부터 왼쪽으로 오름차순인지 확인
	 * 2. 오름차순이 아닌 숫자를 찾으면 포인터에 기록
	 * 1 3(@) 5 4 4
	 * 3. 왼쪽에서 다시 포인터의 위치보다 큰 숫자를 찾아 스왑
	 * 1 4 5 4 3(@)
	 * 4. 포인터의 위치 뒤를 다시 오름차순으로 정렬
	 * 1 4 3 4 5
	 * */
	public void nextPermutation(int[] nums) {
        int a=-1;
        if(nums.length<=1)
            return;
        for(int i=nums.length-1;i>0;i--) {
            if(nums[i]>nums[i-1]) {
                a=i-1;
                break;
            }
        }
        if(a!=-1) {
            for(int i=nums.length-1;i>a;i--)    {
                if(nums[a]<nums[i]) {
                    swap(nums, a, i);
                    break;
                }
            }
        }
        
        int start=a;
        int end=nums.length;
        while(end-start>2){
            if(nums[++start]>nums[--end]) {
                swap(nums, start, end);
            }
        }
    }
    
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

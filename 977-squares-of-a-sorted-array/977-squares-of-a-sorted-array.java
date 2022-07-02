class Solution {
    public int[] sortedSquares(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            nums[count++]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
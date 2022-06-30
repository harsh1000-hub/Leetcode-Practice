class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int median=nums[n/2];
        int min_move=0;
        for(int i=0;i<nums.length;i++){
            min_move+=Math.abs(nums[i]-median);
        }
        return min_move;
    }
}
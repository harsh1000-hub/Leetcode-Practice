class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int xor=0;
        for(i=0;i<nums.length;i++){
            xor=xor^nums[i]^i;
        }
        return xor^i;
        
    }
}
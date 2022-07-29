class Solution {
    public int findMin(int[] nums) {
       int max=Integer.MIN_VALUE;
        for(int val:nums){
            max=Math.max(max,val);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                if(i!=nums.length-1){
                 ans=nums[i+1];   
                }
                else{
                    ans=nums[0];
                }
            }
        }
        return ans;
    }
}
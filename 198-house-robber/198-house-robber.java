class Solution {
    private static int helper(int []nums,int i,int n,int []dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int first_house=nums[i]+helper(nums,i+2,n,dp);
        int second_house=helper(nums,i+1,n,dp);
        dp[i]=Math.max(first_house,second_house);
        return Math.max(first_house,second_house);
    }
    public int rob(int[] nums) {
        int []dp=new int[101];
        Arrays.fill(dp,-1);
        return helper(nums,0,nums.length,dp);
    }
}
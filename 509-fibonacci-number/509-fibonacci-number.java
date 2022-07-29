class Solution {
    int []dp=new int[31];
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        else if(dp[n]!=0){
            return dp[n];
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return dp[n]=fib1+fib2;
    }
}
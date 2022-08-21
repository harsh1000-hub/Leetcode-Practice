class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,sum=0;
        while(n>0){
            p*=n%10;
            sum+=n%10;
            n/=10;
        }
        return p-sum;
        // int product=1;
        // int temp1=n;
        // while(temp1>0){
        //     product*=temp1%10;
        //     temp1/=10;
        // }
        // int temp2=n;
        // int sum=0;
        // while(temp2>0){
        //     sum+=temp2%10;
        //     temp2/=10;
        // }
        // return product-sum;
    }
}
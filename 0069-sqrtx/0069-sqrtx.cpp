class Solution {
public:
    int mySqrt(int x) {
        int start=0,end=x;
        long mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(mid*mid<x){
                ans=mid;
                start=mid+1;
            }
            else if(mid*mid>x){
                end=mid-1;
            }
            else {
                return mid;
            }
            mid=start+(end-start)/2;
            //cout<<ans<<" ";
        }
        return ans;
    }
};
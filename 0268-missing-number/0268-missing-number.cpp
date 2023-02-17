class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int len=nums.size();
        int range=0;
        int sum_arr=0;
        int arr[len+1];
        for(int i=0;i<=len;i++){
            if(range<=len){
                arr[i]=range++;
                sum_arr+=arr[i];
            }
        }
        //cout<<sum_arr<<endl;
        int sum_nums=0;
        for(int i=0;i<nums.size();i++){
            sum_nums+=nums[i];
        }
         return sum_arr-sum_nums;
    }
};
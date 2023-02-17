class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int range=0;
        int sum_arr=0;
        int arr[nums.size()+1];
        int sum_nums=0;
        for(int i=0;i<=nums.size();i++){
            if(range<=nums.size()){
                arr[i]=range++;
                sum_arr+=arr[i];
            }
            if(i<nums.size()){
                sum_nums+=nums[i];
            }
        }
         return sum_arr-sum_nums;
    }
};
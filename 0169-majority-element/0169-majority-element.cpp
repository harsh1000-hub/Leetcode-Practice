class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // if(nums.size()==0){
        //     return nums[0];
        // }
        int check_agent=nums.size()/2;
        int result=0;
        for(int i=0;i<nums.size();i++){
            //inner loop
            int count=1;
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]==INT_MIN){
                    break;
                }
                else if(nums[i]==nums[j]){
                    count++;
                    nums[j]=INT_MIN;
                }
            }
           // cout<<count<<" ";
            if(count>check_agent){
                result=nums[i];
                check_agent=count;
            }
        }
        return result;
    }
};
class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int temp=0;
        for(int i=0;i<nums.size();i++){
            temp^=nums[i];
        }
        return temp;
    }
};
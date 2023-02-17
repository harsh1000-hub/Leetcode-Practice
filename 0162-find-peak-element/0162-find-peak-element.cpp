class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        //base case 
        if(nums.size()==1){
            return 0;
        }
        int start=0,end=nums.size()-1;
        int mid=start+(end-start)/2;
        int temp=0;
        while(start<=end){
            if(mid>0 && mid<nums.size()-1){
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            
            else if(mid==0){
                if(nums[0]>nums[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            
            else if(mid==nums.size()-1){
                if(nums[nums.size()-1]>nums[nums.size()-2]){
                    temp=nums.size()-1;
                    break;
                }
                else{
                    temp=nums.size()-2;
                    break;
                }
            }
            
            mid=start+(end-start)/2;
       }
        return temp;
    }
};
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        /* 
        1. Approach is simple first creata a array arr of size nums.size()+1
        2. In sum_arr variable sum up all element from 0 to n.
        3. In sum_nums variable sum up all element that are in nums vector
        4. Last step return the sum_arr-sum_nums that is equal to missing element
        
        Test case -> nums=[3,0,1]
        sum_nums=3+0+1 -> 4
        arr that is consist of 0 to n elemenet like that 
        arr=[0,1,2,3]
        sum_arr=0+1+2+3 -> 6
        
        return sum_arr - sum_nums that is equal to 6-4 -> 2(missing element)
        */
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
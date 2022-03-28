class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int firstIndex=-1;
        int lastIndex=-1;
        int count=0;
        int []ans=new int[2];
        int []non_ans=new int[2];
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                firstIndex=mid;
                high=mid-1;
            }
            count++;
        }
        ans[0]=firstIndex;
        int low1=0,high1=nums.length-1;
         while(low1<=high1){
            int mid=(low1+high1)/2;
            if(nums[mid]>target){
                high1=mid-1;
            }
            else if(nums[mid]<target){
                low1=mid+1;
            }
            else{
                lastIndex=mid;
                low1=mid+1;
            }
             count++;
        }
        ans[1]=lastIndex;
        if(count>0){
            return ans;
        }
        else{
            non_ans[0]=-1;
            non_ans[1]=-1;
        }
        return non_ans;
    }
}
class Solution {
    private void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        // we use partition there of qucik sort algorithm
        int i=0,j=0,k=nums.length-1;
        while(i<=k){
            if(nums[i]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,k);
                k--;
            }
        }
    }
}
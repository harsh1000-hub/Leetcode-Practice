class Solution {
    public static void rotate(int[] nums, int k){
        int n=nums.length;
        int []temp=new int[n];
        k=k%n;
        if(k<0){
          k=k+n;
        }
        int intial=n-k;
        int count=0;
        for(int i=0;i<k;i++){
            temp[i]=nums[intial++];
            count++;
        }
        int j=0;// for arr array
        for(int i=count;i<n;i++){
            temp[i]=nums[j++];
        }
        for(int q=0;q<n;q++){
            nums[q]=temp[q];
        }
  }

}
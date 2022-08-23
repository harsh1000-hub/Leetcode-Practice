class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff_begin=arr[0]-arr[1];
        for(int i=1;i<arr.length-1;i++){
            if(diff_begin!=arr[i]-arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
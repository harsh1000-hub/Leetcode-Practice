class Solution {
    public int removeDuplicates(int[] A) {
       int count=0;
       int k=0;
       for(int i=1;i<A.length;i++){
           if(A[k]!=A[i]){
               k++;
               A[k]=A[i];
           }
       }
       return k+1;
    }
}
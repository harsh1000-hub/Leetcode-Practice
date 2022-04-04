class Solution {
    public int[][] generateMatrix(int n) {
        int [][]nums=new int[n][n];
        int count=1;
        int minrow=0,mincol=0,maxrow=nums.length-1,maxcol=nums[0].length-1;
        int square=(int)Math.pow(n,2);
        while(count<=square){
            //top
                for(int i=minrow,j=mincol;j<=maxcol;j++){
                nums[i][j]=count++;
        }
            minrow++;
            //right
                for(int i=minrow,j=maxcol;i<=maxrow;i++){
                nums[i][j]=count++;
        }
            maxcol--;
            //bottom
                for(int i=maxrow,j=maxcol;j>=mincol;j--){
                nums[i][j]=count++;
          }
            maxrow--;
            //left
                 for(int i=maxrow,j=mincol;i>=minrow;i--){
                nums[i][j]=count++;
        }
            mincol++;
        }
        return nums;
    }
}
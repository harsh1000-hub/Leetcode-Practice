class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(matrix.length==0){
            return ans;
        }
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        int tne=matrix.length*matrix[0].length;
        int count=0;
        while(count<tne){
            //top
            if(count<tne){
                for(int i=minrow,j=mincol;j<=maxcol;j++){
                ans.add(matrix[i][j]);
                count++;
            }
            }
            
            minrow++;
            // right
            if(count<tne){
                for(int i=minrow,j=maxcol;i<=maxrow;i++){
                    ans.add(matrix[i][j]);
                count++;
            }
        }
            maxcol--;
            // bottom
            if(count<tne){
                 for(int j=maxcol,i=maxrow;j>=mincol;j--){
                   ans.add(matrix[i][j]);
                count++;
            }
          }
            // left
            maxrow--;
            if(count<tne){
                for(int i=maxrow,j=mincol;i>=minrow;i--){
                   ans.add(matrix[i][j]);
                count++;
            } 
        }
            mincol++;
        }
        return ans;
    }
}
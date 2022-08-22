class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        // if(points.length==1){
        //     if(points[0][0]==x && points[0][1]==y){
        //         return 0;
        //     }
        //     else{
        //         return -1;
        //     }
        // }
        int index=-1, min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            // if(points[i][0]==x && points[i][1]==y){
            //     return 0;
            // }
            if(points[i][0]==x || points[i][1]==y){
                int temp=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                if(temp<min){
                    min=temp;
                    index=i;
                }
            }
            
        }
        return index;
    }
}
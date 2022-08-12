class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        
        char[][] ch = new char[n][n];
        
        for(char[] ch1: ch){
           Arrays.fill(ch1, '.');
        }
        
        helper(0,ans,ch,n);
        return ans;
    }
    
    private void helper(int col, List<List<String>> ans, char[][] ch,int n){
        
        if(col==n){
            ans.add(construct(ch));
            return;
        }
            
            for(int row=0;row<n;row++){
                if(isAllowed(row,col,ch)){
                    ch[row][col]='Q';
                    helper(col+1,ans,ch,n);
                     ch[row][col]='.';
                }
            }
    }
    
    // we need to check only left side, left up diagonal and left down diagonal
    private boolean isAllowed(int row, int col, char[][] ch){
        int dupRow = row;
        int dupCol = col;
        
        // check left up diagonal
        while(dupRow>=0 && dupCol>=0){
            if(ch[dupRow][dupCol]=='Q') return false;
            dupRow--;
            dupCol--;
        }
        
         dupRow = row;
         dupCol = col;
        
         // check left down diagonal
        while(dupRow< ch.length && dupCol>=0){
            if(ch[dupRow][dupCol]=='Q') return false;
            dupRow++;
            dupCol--;
        }
        
        dupCol = col;
        dupRow = row;
        
        // check left side
        while(dupCol>=0){
            if(ch[dupRow][dupCol]=='Q') return false;
            dupCol--; 
        }
        
        return true;
    }
    
    // Construct answer
    private List<String> construct(char[][] ch){
        List<String> ans = new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            String s = new String(ch[i]);
            ans.add(s);
        }
        return ans;
    }
}
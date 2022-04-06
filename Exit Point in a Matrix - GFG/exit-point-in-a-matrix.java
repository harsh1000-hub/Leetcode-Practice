// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int[] ans = ob.FindExitPoint(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] FindExitPoint(int[][] matrix)
    {
        int ans[]=new int[2];
        int i=0,j=0;
        int div=0;
        while(true){
            div=(div+matrix[i][j])%4;
            matrix[i][j]=0;
            if(div==0){
                j++;
            }
            else if(div==1){
                i++;
            }
            else if(div==2){
                j--;
            }
            else if(div==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==matrix.length){
                i--;
                break;
            }
            else if(j==matrix[0].length){
                j--;
                break;
            }
        }
        ans[0]=i;
        ans[1]=j;
        return ans;
    }
}
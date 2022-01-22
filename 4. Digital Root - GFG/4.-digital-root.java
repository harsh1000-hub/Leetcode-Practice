// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();//taking number n
            
            //calling digitalRoot() function of 
            //class Digital
            System.out.println(new Solution().digitalRoot(n));
        }
    }
}// } Driver Code Ends

class Solution
{
    public static int digitalRoot(int n)
    {
        if(n<10)
        {
            return n;
        }
        int sum=n%10+digitalRoot(n/10);
        if(sum>9)
        {
            sum=sum%10+digitalRoot(sum/10);
        }
        return sum;
    }
}
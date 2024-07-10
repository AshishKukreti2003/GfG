//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int fib(int N){
        //code here
        if(N == 0) return 0;
        if(N == 1) return 1;
        int a = 0, b=1,c= 0;
        for(int i=2;i<=N;i++){
            c = (a+b)%10;
            a=b;
            b=c;
        }
        return c;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fib(N));
        }
    }
}
// } Driver Code Ends
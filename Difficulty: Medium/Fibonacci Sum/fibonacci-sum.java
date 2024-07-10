//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    static long fibSum(long N) {
        // code here
        int mod = 1000000007;
        long sum = 0;
        if(N == 0) return 0;
        if(N == 1) return 1;
        int[] series = new int[(int)N+1];
        series[1]=1;
        for(int i=2;i<=N;i++){
            series[i] = (series[i-1]+series[i-2])%mod;
        }
        for(int i=1;i<=N;i++){
            sum+=series[i];
        }
        return sum%mod;
        
    }
    
}

//{ Driver Code Starts.
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends
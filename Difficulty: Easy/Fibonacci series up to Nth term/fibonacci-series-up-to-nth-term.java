//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        int MOD = 1000000007;
        if(n == 0){
            return new int[]{0};
        } 
        int[] series = new int[n+1];
        
        series[0] = 0;
        series[1] = 1;
        for(int i=2;i<=n;i++){
            series[i] = (series[i-1]+series[i-2])%MOD;
        }
        return series;
    }   
}

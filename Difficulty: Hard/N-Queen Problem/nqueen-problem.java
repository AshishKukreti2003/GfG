//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        boolean[][] board = new boolean[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        queens(board,0,ans);
        return ans;
    }
    
    static void queens(boolean[][] board, int row, ArrayList<ArrayList<Integer>> ans){
        if(row == board.length){
            ans.add(display(board));
            return;
        }
        for(int col = 0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                queens(board,row+1,ans);
                board[row][col] = false;
            }
        }
    }
    
    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    
    static ArrayList<Integer> display(boolean[][] board){
        ArrayList<Integer> list = new ArrayList<>();
        for(boolean[] row: board){
            for(int col = 0; col<row.length;col++){
                if(row[col]){
                    list.add(col+1);
                }
            }
        }
        return list;
    }
}
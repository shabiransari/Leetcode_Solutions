//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        boolean[] check=new boolean[128];
        int begin=0;
        int end=0;
         for (int low = 0, high = 0; high < S.length(); high++){
            if(check[S.charAt(high)]){
                while(S.charAt(low)!=S.charAt(high)){
                    check[S.charAt(low)]=false;
                    low++;
                }
               low++;
            }else{
                check[S.charAt(high)]=true;
                if(end-begin<high-low){
                    
                    begin=low;
                    end=high;
                }
            }
        }
        return S.substring(begin, end+1).length();
    }
}
import java.util.*;
public class Solution {
    public int numSquares(int n) {
        int []dp=new int[n+1];
        int count=1;
        for(int i=1; i<=n; i++)
        {
           if(i==count*count)
           {
             dp[i]=1;
             count++;
           }
           else
           {
           dp[i]=i;
           int j=count-1;
           while(j>0)
           {
               dp[i]=Math.min(dp[i], dp[i-j*j]+1);
               j-=1;
           }
           }
              
        }
        return dp[n];
    }
}
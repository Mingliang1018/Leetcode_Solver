public class Solution {
    public int longestValidParentheses(String s) {
        int maxLen=0;
        int []dp=new int[s.length()];
        for(int i=1; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            int index=i-1-dp[i-1];
            if(ch==')'&&index>=0&&s.charAt(index)=='(')
            {
                dp[i]=dp[i-1]+2;
                if(index-1>=0)
                    dp[i]+=dp[index-1];
            }
            maxLen=Math.max(maxLen, dp[i]);
            
        }
        return maxLen;
        
        
    }
}
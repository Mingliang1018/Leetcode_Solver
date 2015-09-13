public class Solution {
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0; i<s.length(); i++)
        {
            if(i-1>=0&&s.charAt(i)==s.charAt(i-1))
            {
                int p=i-2;
                int q=i+1;
                while(p>=0&&q<s.length()&&s.charAt(p)==s.charAt(q))
                {
                    p--;
                    q++;
                }
                String str=s.substring(p+1,q);
                if(str.length()>res.length())
                    res=str;
            }
            int p=i-1;
            int q=i+1;
             while(p>=0&&q<s.length()&&s.charAt(p)==s.charAt(q))
                {
                    p--;
                    q++;
                }
                String str=s.substring(p+1,q);
                if(str.length()>res.length())
                    res=str;
            
        }
        return res;
    }
}
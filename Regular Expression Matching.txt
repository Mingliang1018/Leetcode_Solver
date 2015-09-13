public class Solution {
    public boolean match(String s, String p, int s1, int p1)
    {
        if(s1==s.length()&&p1==p.length())
            return true;
        if(p1==p.length())
            return false;
        if(s1==s.length())
        {
            if(p1+1<p.length()&&p.charAt(p1+1)=='*')
                return match(s, p, s1, p1+2);
            return false;
        }
        if(p1+1<p.length()&&p.charAt(p1+1)=='*')
        {
            if(p.charAt(p1)=='.')
            {
                int i=0;
                while(s1+i<=s.length())
                {
                   if(match(s, p, s1+i, p1+2))
                    return true;
                   i++;
                }
                return false;
            }
            else if(p.charAt(p1)==s.charAt(s1))
            {
                int i=0;
                if(match(s, p, s1, p1+2))
                    return true;
                while(s1+i<s.length()&&s.charAt(s1+i)==s.charAt(s1))
                {
                    if(match(s, p, s1+i+1, p1+2))
                        return true;
                    i++;
                }
                return false;
            }
            else
                return match(s, p, s1, p1+2);
        }
        else if(p.charAt(p1)=='.'||p.charAt(p1)==s.charAt(s1))
            return match(s, p, s1+1, p1+1);
        else
            return false;
    }
    public boolean isMatch(String s, String p) {
        if(s==null||p==null)
            return false;
        return match(s, p, 0, 0);
        
    }
}
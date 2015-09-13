public class Solution {
    public int myAtoi(String str) {
        if(str==null||str.length()==0)
            return 0;
        long res=0;
        boolean flag=false;
        int i=0;
        while(i<str.length()&&str.charAt(i)==' ')
        {
            i++;
        }
        if(i==str.length())
            return 0;
        if(str.charAt(i)=='-')
        {
            flag=true;
            i++;
        }
        else if(str.charAt(i)=='+')
            i++;
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9')
        {
            res=res*10+str.charAt(i)-'0';
            if(res-1>Integer.MAX_VALUE)
            {
                if(flag)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            
            i++;
        }
        if(flag)
        {
            res*=-1;
            return (int)res;
        }
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)res;
        
  }
}
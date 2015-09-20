public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null)
            return -1;
        if(needle.length()>haystack.length())
            return -1;
        if(needle.length()==0)
            return 0;
        int []next=new int[needle.length()];
        next[0]=-1;
        int i=0;
        int j=0;
        for(i=1; i<needle.length(); i++)
        {
            j=next[i-1];
            while(j!=-1&&needle.charAt(i-1)!=needle.charAt(j))
                j=next[j];
            next[i]=j+1;
        }

        i=0;
        j=0;
        while(i<haystack.length()&&j<needle.length())
        {
            while(i<haystack.length()&&j<needle.length()&&haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            if(j==needle.length())
                return i-j;
            if(i==haystack.length())
                return -1;
            j=next[j];
            while(j!=-1&&needle.charAt(j)!=haystack.charAt(i))
            {
            	//System.out.println("i="+i+"j="+j);
                j=next[j];
            }
            if(j==-1)
            {
                i++;
                j++;
            }
        }
        return -1;
    }
}
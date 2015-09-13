public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        if(strs.length==0)
            return res;
        int i=0;
        while(i<strs[0].length())
        {
            char ch=strs[0].charAt(i);
            int j=1;
            while(j<strs.length&&i<strs[j].length()&&strs[j].charAt(i)==ch)
                j++;
            if(j==strs.length)
            {
                res+=ch;
                i++;
            }
            else
                return res;
        }
        return res;
    }
}
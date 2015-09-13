import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;
        Hashtable<Character, Integer> table=new Hashtable();
        int maxLen=0;
        int start=0;
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(table.containsKey(ch))
            {
                maxLen=Math.max(maxLen, i-start);
                start=Math.max(start, table.get(ch)+1);
                table.put(ch, i);
            }
            else
                table.put(ch, i);
        }
        maxLen=Math.max(maxLen, s.length()-start);
        return maxLen;
    }
}
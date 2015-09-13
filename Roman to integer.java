import java.util.*;
public class Solution {
    public int romanToInt(String s) {
        Hashtable<Character, Integer> table=new Hashtable();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
        int res=0;
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(i+1<s.length()&&table.get(ch)<table.get(s.charAt(i+1)))
                res-=table.get(ch);
            else
                res+=table.get(ch);
        }
        return res;
    }
}
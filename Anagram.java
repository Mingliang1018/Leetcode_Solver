public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null||t==null)
            return false;
        if(s.length()!=t.length())
            return false;
        int []array=new int[256];
        for(int i=0; i<s.length(); i++)
        {
            int index=s.charAt(i);
            array[index]++;
        }
        for(int i=0; i<t.length(); i++)
        {
            int index=t.charAt(i);
            if(array[index]==0)
                return false;
            array[index]--;
        }
        return true;
    }
}
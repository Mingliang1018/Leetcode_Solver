import java.util.*;
public class Solution {
    public List<String> getCombination(String digits, int s1, List<String> list, String []strs)
    {
        if(s1==digits.length())
            return list;
        String s=strs[digits.charAt(s1)-'0'];
        //System.out.println("s="+s);
        List<String> newList=new ArrayList();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            for(String ss: list)
            {
                newList.add(ss+ch);
            }
        }
        return getCombination(digits, s1+1, newList, strs );
        
    }
    public List<String> letterCombinations(String digits) {
       String []strs={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       List<String> list=new ArrayList();
       if(digits==null||digits.length()==0)
        return list;
       list.add("");
       return getCombination(digits, 0, list, strs);
       
       
    }
}
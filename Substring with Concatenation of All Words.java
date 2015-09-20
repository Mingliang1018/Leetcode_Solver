import java.util.*;
public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res=new ArrayList();
        if(words.length==0||s==null||s.length()==0)
            return res;
        int len=words[0].length();
        if(len*words.length>s.length())
            return res;
        Hashtable<String, Integer> table=new Hashtable();
        for(int i=0; i<words.length; i++)
        {
            if(table.containsKey(words[i]))
            {
                table.put(words[i], table.get(words[i])+1);
            }
            else
                table.put(words[i], 1);
        }
        
        String []strs=new String[s.length()-len+1];
        for(int i=0; i<=s.length()-len; i++)
        {
            String ss=s.substring(i, i+len);
            if(table.containsKey(ss))
            {
                strs[i]=ss;
            }
            else
                strs[i]="";
        }
        
        
        for(int k=0; k<len; k++)
        {
        	
           int i=k;
           int found=0;
           int start=i;
           Hashtable<String, Integer> table1=new Hashtable();
           while(i<=s.length()-len)
           {
           
           if(strs[i].equals(""))
           {
               start=i+len;
               found=0;
               table1=new Hashtable();
           }
           else
           {
             if(table1.containsKey(strs[i]))
             {
                 table1.put(strs[i], table1.get(strs[i])+1);
             }
             else
                table1.put(strs[i], 1);
            found++;
            //System.out.println("strs[i]"+strs[i]+"found="+found);
            if(table1.get(strs[i])>table.get(strs[i]))
            {
            	
                int j=start;
                while(!strs[j].equals(strs[i]))
                {
                    
                    table1.put(strs[j], table1.get(strs[j])-1);
                    j+=len;
                    found--;
                }
                found--;
                table1.put(strs[j], table1.get(strs[j])-1);
                start=j+len;
                
            }
            if(found==words.length)
                res.add(start);
            
            
           }
           i+=len;
        }
        }
        return res;
       
       
    }
}
import java.util.*;
public class Solution {
    
    public List<String> getAddOperators(char flag, long previous, String num, int target, int index)
    {
       List<String> list=new ArrayList();
       if(previous>Integer.MAX_VALUE)
    	   return list;
       int i=index+1;
       while(i<num.length())
       {
    	       	   
    	   long newVal=Long.parseLong(num.substring(index, i));
           int val=0;
           if(newVal>Integer.MAX_VALUE)
        	   return list;
           else
        	   val=(int)newVal;
            if(flag=='*')
            {
              long n=val*previous;
              if(n>Integer.MAX_VALUE)
            	  return list;
              else
                  val=(int)n;
            }
            else if(flag=='-')
               val*=-1;
                //add
            //System.out.println("val="+val+",target="+target);
            
            List<String> ll=getAddOperators('+', 1, num, target-val, i);
            for(String ss:ll)
            {
            	String str=num.substring(index, i);
            	str+="+"+ss;
                 list.add(str);
            }
                 //*
            ll=getAddOperators('*', val, num, target, i);
            for(String ss:ll)
            {
            	String str=num.substring(index, i);
            	str+="*"+ss;
                 list.add(str);            }                
            //-               
            ll=getAddOperators('-', 1, num, target-val, i);
            for(String ss:ll)
            {
            	String str=num.substring(index, i);
            	str+="-"+ss;
                 list.add(str);
            }
            if(num.charAt(index)=='0')
         	   return list;
            i++;
        }
       long newVal=Long.parseLong(num.substring(index, i));
       int val=0;
       if(newVal>Integer.MAX_VALUE)
    	   return list;
       else
    	   val=(int)newVal;
       if(flag=='*')
       {
    	   val*=previous;
       }
       else if(flag=='-')
    	   val*=-1;
       if(val==target)
       {
    	   String str=num.substring(index);
    	   list.add(str);
       }
       return list;
    }
    public List<String> addOperators(String num, int target) {
        List<String> list=new ArrayList();
        if(num==null||num.length()==0)
            return list;
        return getAddOperators('+', 1, num, target, 0);
        
        
        
    }
}
       
       
       
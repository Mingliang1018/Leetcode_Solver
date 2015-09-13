public class Solution {
    public String convert(String s, int numRows) {
      if(s==null)
        return null;
      if(numRows<=1)
        return s;
      String []strs=new String[numRows];
      for(int i=0; i<numRows; i++)
      {
          strs[i]="";
      }
      boolean isUp=false;
      int index=0;
      for(int i=0; i<s.length(); i++)
      {
          strs[index]+=s.charAt(i);
          if(isUp==false)
          {
              index++;
              if(index>numRows-1)
              {
                  index-=2;
                  isUp=true;
              }
          }
          else
          {
              index--;
              if(index<0)
              {
                  index+=2;
                  isUp=false;
              }
          }
      }
      String res="";
      for(int i=0; i<numRows; i++)
      {
          res+=strs[i];
      }
      return res;
      
        
    }
}
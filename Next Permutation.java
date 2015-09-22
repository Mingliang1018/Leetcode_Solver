import java.util.*;
public class Solution {
    public void nextPermutation(int[] num) {
      int i=num.length-2;
      while(i>=0&&num[i]>=num[i+1])
        i--;
      if(i<0)
      {
        i=0;
        int j=num.length-1;
        while(i<j)
        {
           int tmp=num[i];
           num[i]=num[j];
           num[j]=tmp;
           i++;
           j--;
        }
        return;
      }
      int j=num.length-1;
      while(num[j]<=num[i])
        j--;
      int tmp=num[i];
      num[i]=num[j];
      num[j]=tmp;
      i=i+1;
      j=num.length-1;
      while(i<j)
      {
          tmp=num[i];
          num[i]=num[j];
          num[j]=tmp;
          i++;
          j--;
      }
    }
}
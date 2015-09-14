import java.util.*;
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> list=new ArrayList();
        
        for(int i=0; i+3<=num.length; i++)
        {
            if(i-1>=0&&num[i-1]==num[i])
                continue;
            int j=i+1;
            int k=num.length-1;
            while(j<k)
            {
                int sum=num[i]+num[j]+num[k];
                if(sum==0)
                {
                    List<Integer> li=new ArrayList();
                    li.add(num[i]);
                    li.add(num[j]);
                    li.add(num[k]);
                    list.add(li);
                    j++;
                    while(j<k&&num[j]==num[j-1])
                        j++;
                }
                else if(sum<0)
                    j++;
                else
                    k--;
            }
        }
        return list;
        
    }     
}
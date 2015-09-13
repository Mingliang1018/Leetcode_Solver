import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table=new Hashtable();
        for(int i=0; i<nums.length; i++)
        {
            table.put(nums[i], i+1);
        }
        int []ans=new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int k=target-nums[i];
            if(table.containsKey(k)&&table.get(k)!=(i+1))
            {
                ans[0]=i+1;
                ans[1]=table.get(k);
                return ans;
            }
        }
        return ans;
    }
}
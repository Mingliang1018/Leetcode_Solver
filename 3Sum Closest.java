import java.util.*;
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        
        for(int i=0; i+3<=nums.length; i++)
        {
            if(i-1>=0&&nums[i-1]==nums[i])
            {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(res-target))
                    res=sum;
                if(sum==target)
                {
                    return target;
                }
                else if(sum<target)
                    j++;
                else
                    k--;
            }
        }
        return res;

    }
}
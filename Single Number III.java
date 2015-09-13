public class Solution {
    public int[] singleNumber(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length; i++)
        {
            n^=nums[i];
        }
        int tag=1;
        while((tag&n)==0)
            tag<<=1;
        int x=0, y=0;
        for(int i=0; i<nums.length; i++)
        {
            if((tag&nums[i])==0)
            {
                x^=nums[i];
            }
            else
                y^=nums[i];
        }
        int []ans=new int[2];
        ans[0]=x;
        ans[1]=y;
        return ans;
    }
}
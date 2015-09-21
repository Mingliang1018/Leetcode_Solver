public class Solution {
    public int search(int[] nums, int target) {
        int i=0, j=nums.length-1;
        int len=nums.length;
        if(len==0)
            return -1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
            {
               if(nums[mid]>=nums[0]) 
               {
                   i=mid+1;
               }
               else
               {
                   if(target<=nums[len-1])
                   {
                       i=mid+1;
                   }
                   else
                    j=mid-1;
               }
            }
            else
            {
               if(nums[mid]>=nums[0])
               {
                   if(target>=nums[0])
                    j=mid-1;
                   else
                    i=mid+1;
               }
               else
               {
                   j=mid-1;
               }
            }
        }
        return -1;
    }
}
public class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=-1, j=nums.length;
       while(i<j-1)
       {
           int mid=(i+j)/2;
           if(nums[mid]==target)
            return mid;
           else if(nums[mid]<target)
            i=mid;
           else
            j=mid;
       }
       return j;
    }
}
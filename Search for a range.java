public class Solution {
    public int findLeft(int []nums, int target, int l, int r)
    {
        int i=l, j=r;
        while(i<j-1)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
                j=mid;
            else
                i=mid;
        }
        return j;
    }
    public int findRight(int []nums, int target, int l, int r)
    {
        int i=l, j=r;
        while(i<j-1)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
                i=mid;
            else
                j=mid;
        }
        return i;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int i=0, j=nums.length-1;
        int []res={-1,-1};
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
                res[0]=findLeft(nums, target, i-1, mid);
                res[1]=findRight(nums, target, mid, j+1);
                return res;
            }
            else if(nums[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return res;
    }
}
public class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        if(len<2)
            return 0;
        int i=0, j=len-1;
        int maxArea=0;
        while(i<j)
        {
            maxArea=Math.max(maxArea, Math.min(height[i], height[j])*(j-i));
            if(height[i]<=height[j])
            {
                int p=i+1;
                while(p<j&&height[p]<=height[i])
                    p++;
                i=p;
                
            }
            else
            {
                int p=j-1;
                while(p>i&&height[p]<=height[j])
                    p--;
                j=p;
            }
        }
        return maxArea;
    }
}
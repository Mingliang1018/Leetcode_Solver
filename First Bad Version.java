/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=0, j=n;
        while(i<j-1)
        {
            int mid=(int)(((long)i+j)/2);
            if(isBadVersion(mid))
            {
                j=mid;
            }
            else
                i=mid;
        }
        return j;
        
    }
}
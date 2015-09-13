public class Solution {
    public int hIndex(int[] citations) {
        int c=1;
        int n=citations.length;
        while(c<=n&&citations[n-c]>=c)
            c++;
        return c-1;
        
    }
}
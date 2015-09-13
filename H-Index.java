public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int num=1;
        int n=citations.length;
        while(num<=n&&citations[n-num]>=num)
            num++;
        return num-1;
    }
}
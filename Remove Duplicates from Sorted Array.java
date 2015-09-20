public class Solution {
    public int removeDuplicates(int[] A) {
        int index=0;
        for(int i=0; i<A.length; i++)
        {
            if(i-1<0||A[i]!=A[i-1])
                A[index++]=A[i];
        }
        return index;
    }
}
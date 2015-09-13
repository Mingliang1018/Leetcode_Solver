import java.util.*;
public class Solution {
    public int reverse(int x) {
       long res=0;
       int n=x;
       while(n!=0)
       {
           res=res*10+n%10;
           n=n/10;
           if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)
            return 0;
       }
       return (int)res;
    }
}
public class Solution {
    public boolean isPalindrome(int x) {
      if(x<0)
        return false;
      long res=0;
      int n=x;
      while(n!=0)
      {
          res=res*10+n%10;
          n/=10;
      }
      return res==x;
    }
}
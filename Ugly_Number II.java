import java.util.*;
public class Solution {
    public int nthUglyNumber(int n) {
       if(n==1)
        return 1;
       Queue<Long> que2=new LinkedList();
       Queue<Long> que3=new LinkedList();
       Queue<Long> que5=new LinkedList();
       que2.offer((long)2);
       que3.offer((long)3);
       que5.offer((long)5);
       long tmp=0;
       while(n-->1)
       {
           tmp=Math.min(Math.min(que2.peek(), que3.peek()), que5.peek());
           if(tmp==que2.peek())
           {
               que2.poll();
               que2.offer(tmp*2);
               que3.offer(tmp*3);
               que5.offer(tmp*5);
           }
           else if(tmp==que3.peek())
           {
               que3.poll();
               que3.offer(tmp*3);
               que5.offer(tmp*5);
           }
           else
           {
               que5.poll();
               que5.offer(tmp*5);
           }
       }
       return (int)tmp;
       
    }
}
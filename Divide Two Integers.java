public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0)
            return Integer.MAX_VALUE;
        boolean flag1=false;
        boolean flag2=false;
        long d1=(long)dividend;
        long d2=(long)divisor;
        if(d1<0)
        {
            flag1=true;
            d1*=-1;
        }
        if(d2<0)
        {
            flag2=true;
            d2*=-1;
        }
        long res=0;
        while(d1>=d2)
        {
            long count=1;
            long d=d2;
            while(d1>=d)
            {
                d1-=d;
                res+=count;
                d+=d;
                count+=count;
                if(res-1>Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            }
        }
        if((flag1==false&&flag2==true)||(flag1==true)&&(flag2==false))
        {
            res*=-1;
            return (int)res;
        }
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)res;
        
        
    }
}
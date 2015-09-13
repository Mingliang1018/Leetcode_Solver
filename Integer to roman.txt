public class Solution {
    public String intToRoman(int num) {
       String [][]strs={
       {"","I","II","III","IV","V","VI","VII","VIII","IX"},
       {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
       {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
       {"","M","MM","MMM"}};
       String res="";
       int i=0;
       while(num!=0)
       {
           res=strs[i++][num%10]+res;
           num/=10;
           
       }
       return res;
    }
}
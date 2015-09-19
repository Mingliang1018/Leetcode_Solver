import java.util.*;
public class Solution {
    
    public boolean isValid(String s) {
       Stack<Character> sta=new Stack();
       for(int i=0; i<s.length(); i++)
       {
           char ch=s.charAt(i);
           if(ch=='{'||ch=='['||ch=='(')
            sta.push(ch);
           else
           {
               if(ch=='}'&&!sta.isEmpty()&&sta.peek()=='{')
                 sta.pop();
               else if(ch==']'&&!sta.isEmpty()&&sta.peek()=='[')
                sta.pop();
               else if(ch==')'&&!sta.isEmpty()&&sta.peek()=='(')
                sta.pop();
               else
                return false;
               
               
           }
       }
       return sta.isEmpty();
    }
}
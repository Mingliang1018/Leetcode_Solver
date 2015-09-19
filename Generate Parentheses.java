import java.util.*;
public class Solution {
    public void generate(String str, int leftP, int unPutP, List<String> list)
    {
        if(leftP==0&&unPutP==0)
        {
            list.add(str);
            return;
        }
        if(leftP==0)
        {
            generate(str+'(', leftP+1, unPutP-1, list);
        }
        else if(unPutP==0)
        {
            generate(str+')', leftP-1, unPutP, list);
        }
        else
        {
            generate(str+'(', leftP+1, unPutP-1, list);
            generate(str+')', leftP-1, unPutP, list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList();
        generate("", 0, n, list);
        return list;
    }
}
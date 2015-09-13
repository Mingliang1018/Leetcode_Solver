/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public void getPaths(List<String> list, String str, TreeNode root)
    {
        if(root==null)
            return;
        if(str.length()==0)
        {
                str+=String.valueOf(root.val);
        }
        else
        {
                str+="->"+String.valueOf(root.val);
        }
        if(root.left==null&&root.right==null)
        {
            list.add(str);
        }
        else
        {
            getPaths(list, str, root.left);
            getPaths(list, str, root.right);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
       String str="";
       List<String> list=new ArrayList();
       getPaths(list, str, root);
       return list;
    }
}
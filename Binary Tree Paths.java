{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 /**
 * Definition for a binary tree node.
 * public class TreeNode \{
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) \{ val = x; \}
 * \}
 */
import java.util.*;
public class Solution \{
    public void getPaths(List<String> list, String str, TreeNode root)
    \{
        if(root==null)
            return;
        if(str.length()==0)
        \{
                str+=String.valueOf(root.val);
        \}
        else
        \{
                str+="->"+String.valueOf(root.val);
        \}
        if(root.left==null&&root.right==null)
        \{
            list.add(str);
        \}
        else
        \{
            getPaths(list, str, root.left);
            getPaths(list, str, root.right);
        \}
    \}
    public List<String> binaryTreePaths(TreeNode root) \{
       String str="";
       List<String> list=new ArrayList();
       getPaths(list, str, root);
       return list;
    \}
\}}
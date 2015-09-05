{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 import java.util.*;\
public class Solution \{\
    public int[] twoSum(int[] nums, int target) \{\
        Hashtable<Integer, Integer> table=new Hashtable();\
        for(int i=0; i<nums.length; i++)\
        \{\
            table.put(nums[i], i+1);\
        \}\
        int []ans=new int[2];\
        for(int i=0; i<nums.length; i++)\
        \{\
            int k=target-nums[i];\
            if(table.containsKey(k)&&table.get(k)!=(i+1))\
            \{\
                ans[0]=i+1;\
                ans[1]=table.get(k);\
                return ans;\
            \}\
        \}\
        return ans;\
    \}\
\}}
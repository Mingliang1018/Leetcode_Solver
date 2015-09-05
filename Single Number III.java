{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int[] singleNumber(int[] nums) \{\
        int n=0;\
        for(int i=0; i<nums.length; i++)\
        \{\
            n^=nums[i];\
        \}\
        int tag=1;\
        while((tag&n)==0)\
            tag<<=1;\
        int x=0, y=0;\
        for(int i=0; i<nums.length; i++)\
        \{\
            if((tag&nums[i])==0)\
            \{\
                x^=nums[i];\
            \}\
            else\
                y^=nums[i];\
        \}\
        int []ans=new int[2];\
        ans[0]=x;\
        ans[1]=y;\
        return ans;\
    \}\
\}}
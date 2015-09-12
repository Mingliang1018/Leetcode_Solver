{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 import java.util.*;\
public class Solution \{\
    public int numSquares(int n) \{\
        int []dp=new int[n+1];\
        int count=1;\
        for(int i=1; i<=n; i++)\
        \{\
           if(i==count*count)\
           \{\
             dp[i]=1;\
             count++;\
           \}\
           else\
           \{\
           dp[i]=i;\
           int j=count-1;\
           while(j>0)\
           \{\
               dp[i]=Math.min(dp[i], dp[i-j*j]+1);\
               j-=1;\
           \}\
           \}\
              \
        \}\
        return dp[n];\
    \}\
\}}
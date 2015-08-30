{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 import java.util.*;\
public class Solution \{\
    public int nthUglyNumber(int n) \{\
       if(n==1)\
        return 1;\
       Queue<Long> que2=new LinkedList();\
       Queue<Long> que3=new LinkedList();\
       Queue<Long> que5=new LinkedList();\
       que2.offer((long)2);\
       que3.offer((long)3);\
       que5.offer((long)5);\
       long tmp=0;\
       while(n-->1)\
       \{\
           tmp=Math.min(Math.min(que2.peek(), que3.peek()), que5.peek());\
           if(tmp==que2.peek())\
           \{\
               que2.poll();\
               que2.offer(tmp*2);\
               que3.offer(tmp*3);\
               que5.offer(tmp*5);\
           \}\
           else if(tmp==que3.peek())\
           \{\
               que3.poll();\
               que3.offer(tmp*3);\
               que5.offer(tmp*5);\
           \}\
           else\
           \{\
               que5.poll();\
               que5.offer(tmp*5);\
           \}\
       \}\
       return (int)tmp;\
       \
    \}\
\}}
{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 import java.util.*;\
public class Solution \{\
    public int reverse(int x) \{\
       long res=0;\
       int n=x;\
       while(n!=0)\
       \{\
           res=res*10+n%10;\
           n=n/10;\
           if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)\
            return 0;\
       \}\
       return (int)res;\
    \}\
\}}
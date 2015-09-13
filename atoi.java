{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int myAtoi(String str) \{\
        if(str==null||str.length()==0)\
            return 0;\
        long res=0;\
        boolean flag=false;\
        int i=0;\
        while(i<str.length()&&str.charAt(i)==' ')\
        \{\
            i++;\
        \}\
        if(i==str.length())\
            return 0;\
        if(str.charAt(i)=='-')\
        \{\
            flag=true;\
            i++;\
        \}\
        else if(str.charAt(i)=='+')\
            i++;\
        while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9')\
        \{\
            res=res*10+str.charAt(i)-'0';\
            if(res-1>Integer.MAX_VALUE)\
            \{\
                if(flag)\
                    return Integer.MIN_VALUE;\
                return Integer.MAX_VALUE;\
            \}\
            \
            i++;\
        \}\
        if(flag)\
        \{\
            res*=-1;\
            return (int)res;\
        \}\
        if(res>Integer.MAX_VALUE)\
            return Integer.MAX_VALUE;\
        return (int)res;\
        \
  \}\
\}}
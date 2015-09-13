{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public String longestPalindrome(String s) \{\
        String res="";\
        for(int i=0; i<s.length(); i++)\
        \{\
            if(i-1>=0&&s.charAt(i)==s.charAt(i-1))\
            \{\
                int p=i-2;\
                int q=i+1;\
                while(p>=0&&q<s.length()&&s.charAt(p)==s.charAt(q))\
                \{\
                    p--;\
                    q++;\
                \}\
                String str=s.substring(p+1,q);\
                if(str.length()>res.length())\
                    res=str;\
            \}\
            int p=i-1;\
            int q=i+1;\
             while(p>=0&&q<s.length()&&s.charAt(p)==s.charAt(q))\
                \{\
                    p--;\
                    q++;\
                \}\
                String str=s.substring(p+1,q);\
                if(str.length()>res.length())\
                    res=str;\
            \
        \}\
        return res;\
    \}\
\}}
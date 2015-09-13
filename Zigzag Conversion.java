{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public String convert(String s, int numRows) \{\
      if(s==null)\
        return null;\
      if(numRows<=1)\
        return s;\
      String []strs=new String[numRows];\
      for(int i=0; i<numRows; i++)\
      \{\
          strs[i]="";\
      \}\
      boolean isUp=false;\
      int index=0;\
      for(int i=0; i<s.length(); i++)\
      \{\
          strs[index]+=s.charAt(i);\
          if(isUp==false)\
          \{\
              index++;\
              if(index>numRows-1)\
              \{\
                  index-=2;\
                  isUp=true;\
              \}\
          \}\
          else\
          \{\
              index--;\
              if(index<0)\
              \{\
                  index+=2;\
                  isUp=false;\
              \}\
          \}\
      \}\
      String res="";\
      for(int i=0; i<numRows; i++)\
      \{\
          res+=strs[i];\
      \}\
      return res;\
      \
        \
    \}\
\}}
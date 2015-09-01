{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    String []str1=\{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"\};\
    String []str2=\{"", "", "Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"\};\
    String []str3=\{"Ten", "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"\};\
    public String getWords(int num)\
    \{\
        String ans="";\
        if(num==0)\
            return ans;\
        int digit=num%10;\
        num/=10;\
        int tenth=num%10;\
        num/=10;\
        int hungth=num%10;\
        if(tenth==1)\
        \{\
            ans=str3[digit];\
        \}\
        else\
        \{\
            if(str2[tenth].length()==0)\
                ans=str1[digit];\
            else if(str1[digit].length()==0)\
                ans=str2[tenth];\
            else\
                ans=str2[tenth]+" "+str1[digit];\
        \}\
        if(hungth!=0)\
        \{\
        	if(ans.length()==0)\
        		ans=str1[hungth]+" "+"Hundred";\
        	else\
        		ans=str1[hungth]+" "+"Hundred "+ans;\
        \}\
        return ans;\
            \
        \
    \}\
    public String numberToWords(int num) \{\
        if(num==0)\
            return "Zero";\
        String []str1=\{"", "Thousand", "Million", "Billion"\};\
        int k=0;\
        String res="";\
        while(num!=0)\
        \{\
            int n=num%1000;\
            num/=1000;\
            String ans=getWords(n);\
            if(ans.length()==0)\
            \{\
                k++;\
                continue;\
            \}\
            if(str1[k].length()!=0)\
                ans=ans+" "+str1[k++];\
            else\
                k++;\
            if(res.length()==0)\
                res=ans;\
            else\
                res=ans+" "+res;\
        \}\
        return res;\
    \}\
\}}
{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 /**\
 * Definition for singly-linked list.\
 * public class ListNode \{\
 *     int val;\
 *     ListNode next;\
 *     ListNode(int x) \{ val = x; \}\
 * \}\
 */\
public class Solution \{\
    \
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) \{\
        if(l1==null)\
            return l2;\
        if(l2==null)\
            return l1;\
        ListNode newHead=new ListNode(1);\
        ListNode last=newHead;\
        int carry=0;\
        while(l1!=null&&l2!=null)\
        \{\
           int num=(l1.val+l2.val+carry)%10;\
           carry=(l1.val+l2.val+carry)/10;\
           ListNode node=new ListNode(num);\
           last.next=node;\
           last=node;\
           l1=l1.next;\
           l2=l2.next;\
        \}\
        if(l1==null)\
        \{\
            if(carry==0)\
            \{\
                last.next=l2;\
                return newHead.next;\
            \}\
            else\
            \{\
                while(carry!=0&&l2!=null)\
                \{\
                    int num=(l2.val+carry)%10;\
                    carry=(l2.val+carry)/10;\
                    ListNode node=new ListNode(num);\
                    last.next=node;\
                    last=node;\
                    l2=l2.next;\
                \}\
                if(carry==0)\
                    last.next=l2;\
                else\
                \{\
                    ListNode node=new ListNode(1);\
                    last.next=node;\
                \}\
                return newHead.next;\
            \}\
        \}\
        else\
        \{\
            if(carry==0)\
            \{\
                last.next=l1;\
                return newHead.next;\
            \}\
            else\
            \{\
                while(carry!=0&&l1!=null)\
                \{\
                    int num=(l1.val+carry)%10;\
                    carry=(l1.val+carry)/10;\
                    ListNode node=new ListNode(num);\
                    last.next=node;\
                    last=node;\
                    l1=l1.next;\
                \}\
                if(carry==0)\
                    last.next=l1;\
                else\
                \{\
                    ListNode node=new ListNode(1);\
                    last.next=node;\
                \}\
                return newHead.next;\
            \}\
            \
        \}\
        \
    \}\
\}}
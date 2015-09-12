{\rtf1\ansi\ansicpg1252\cocoartf1265\cocoasubrtf210
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 public class Solution \{\
    public int findKthNumber(int []nums1, int []nums2, int s1, int s2, int k)\
    \{\
        if(s1>nums1.length-1)\
            return nums2[s2+k-1];\
        if(s2>nums2.length-1)\
            return nums1[s1+k-1];\
        if(k==1)\
            return Math.min(nums1[s1], nums2[s2]);\
        int key1=s1+k/2-1<=nums1.length-1?nums1[s1+k/2-1]:Integer.MAX_VALUE;\
        int key2=s2+k/2-1<=nums2.length-1?nums2[s2+k/2-1]:Integer.MAX_VALUE;\
        if(key1>key2)\
        \{\
            return findKthNumber(nums1, nums2, s1, s2+k/2,k-k/2);\
        \}\
        else\
            return findKthNumber(nums1, nums2, s1+k/2, s2, k-k/2);\
    \}\
    public double findMedianSortedArrays(int[] nums1, int[] nums2) \{\
       int total=nums1.length+nums2.length;\
       if(total%2!=0)\
       \{\
           return (double)findKthNumber(nums1, nums2, 0, 0, total/2+1);\
       \}\
       else\
       \{\
           return ((double)findKthNumber(nums1, nums2, 0, 0, total/2)+findKthNumber(nums1, nums2, 0, 0, total/2+1))/2.0;\
       \}\
       \
    \}\
\}}
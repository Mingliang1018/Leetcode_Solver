/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode merge(ListNode l1, ListNode l2)
    {
        ListNode preHead=new ListNode(0);
        ListNode last=preHead;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
                last.next=l1;
                last=l1;
                l1=l1.next;
            }
            else
            {
                last.next=l2;
                last=l2;
                l2=l2.next;
            }
        }
        if(l1==null)
            last.next=l2;
        else
            last.next=l1;
        return preHead.next;
    }
    public ListNode getMerge(ListNode []lists, int s1, int e1)
    {
        if(s1==e1)
            return lists[s1];
        int mid=(s1+e1)/2;
        ListNode l1=getMerge(lists, s1, mid);
        ListNode l2=getMerge(lists, mid+1, e1);
        return merge(l1, l2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==0)
        return null;
       return getMerge(lists, 0, lists.length-1);
    }
}
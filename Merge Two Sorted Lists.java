/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
}
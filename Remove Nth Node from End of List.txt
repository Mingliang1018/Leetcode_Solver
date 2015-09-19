/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=head;
        int step=n;
        while(step-->0)
        {
            p1=p1.next;
        }
        ListNode p2=head;
        ListNode preHead=new ListNode(0);
        ListNode last=preHead;
        last.next=head;
        ListNode pre=preHead;
        while(p1!=null)
        {
            pre=p2;
            p2=p2.next;
            p1=p1.next;
            
        }
        pre.next=p2.next;
        return preHead.next;
        
    }
}
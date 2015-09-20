/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
       ListNode preHead=new ListNode(0);
       ListNode last=preHead;
       ListNode p=head;
       while(p!=null&&p.next!=null)
       {
           ListNode q=p.next;
           ListNode tmp=q.next;
           q.next=p;
           last.next=q;
           last=p;
           p=tmp;
       }
       last.next=p;
       return preHead.next;
    }
}
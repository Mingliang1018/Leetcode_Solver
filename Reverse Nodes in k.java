/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode p=head;
        while(p!=null)
        {
            count++;
            p=p.next;
        }
        ListNode preHead=new ListNode(0);
        ListNode last=preHead;
        
        p=head;
        int step=count/k;
        while(step-->0)
        {
            ListNode pre=p;
            ListNode cur=p.next;
            int t=k;
            while(t-->1)
            {
                ListNode tmp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=tmp;
            }
            last.next=pre;
            last=p;
            p=cur;
        }
        last.next=p;
        return preHead.next;
    }
}
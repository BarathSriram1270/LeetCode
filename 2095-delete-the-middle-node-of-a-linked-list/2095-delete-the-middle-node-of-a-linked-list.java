/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head.next;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            if(fast.next==null||fast.next.next==null||fast.next.next.next==null){
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next!=null)
        slow.next=slow.next.next;
        else
        slow.next=null;
        return head;
    }
}
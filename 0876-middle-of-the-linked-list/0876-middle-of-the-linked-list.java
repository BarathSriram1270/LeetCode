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
    public ListNode middleNode(ListNode head) {
        if(head.next.next==null) return head.next;
        ListNode slow=head;
        ListNode fast=head;
        int f=1;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast.next==null){
                f=1;
            }
            else{
                f=0;
            }
        }
        if(f==0) return slow.next;
        return slow;
        
    }
}
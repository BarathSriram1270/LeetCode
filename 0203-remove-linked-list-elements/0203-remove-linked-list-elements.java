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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode temp=head;
        while(temp!=null){
            if(temp==head && temp.val==val){
                temp=temp.next;
                head=head.next;
                continue;
            }
            else if(temp.next !=null && temp.next.val==val){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
}
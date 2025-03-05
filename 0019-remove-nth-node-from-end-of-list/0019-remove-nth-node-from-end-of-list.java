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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int tot=0;
        while(temp!=null){
            temp=temp.next;
            tot++;
        }
        System.out.println(tot);
        int del=tot-n;
        System.out.println(del);
        temp=head;
        if(del==0){
            head=head.next;
            return head;
        }
        while(temp!=null && del>1){
            temp=temp.next;
            del--;
        }
        System.out.println(temp.val);
        if(temp.next==null && temp.next.next==null){
            temp.next=null;
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
}
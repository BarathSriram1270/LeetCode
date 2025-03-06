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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int x=1;
        while(temp.next!=null){
            temp=temp.next;
            x++;
        }
        k=k%x;
        temp.next=head;
        temp=head;
        int del=x-k;
        System.out.println(del+"  "+x+"  "+k);
        while(del>1){
            System.out.println(temp.val);
            temp=temp.next;
            del--;
        }
        ListNode ret=temp.next;
        temp.next=null;
        return ret;
    }
}
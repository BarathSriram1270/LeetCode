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
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
        ListNode slowpt=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==null || fast.next==null){
                slowpt.next=null;
                break;
            }
            slowpt=slowpt.next;
        }
        System.out.println(slow.val);
        ListNode sec=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=sec;
            sec=slow;
            slow=next;
        }
        System.out.println(sec.val);
        ListNode temp=head,temp1=sec;
        int sum=0,max=0;
        while(temp!=null){
            sum=temp.val+temp1.val;
            if(sum>max) max=sum;
            temp=temp.next;
            temp1=temp1.next;
        }
        return max;
    }
}
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode p1=temp,p2=temp;
        int c=0;
        while(temp!=null){
            if(c==a-1){
                p1=temp.next;
                temp.next=list2;
            }
            if(temp.next==null){
                p2=temp;
            }
            temp=temp.next;
            c++;
        }
        
        while(a<b){
            p1=p1.next;
            a++;
        }
        p2.next=p1.next;
        //  ListNode t2=list1;
        //  while(t2!=null){
        //      System.out.print(t2.val+"->");
        //      t2=t2.next;
        // }
        return list1;
    }
}
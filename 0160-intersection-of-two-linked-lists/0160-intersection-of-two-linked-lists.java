/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        if(headA.next==null && headB.next==null) return headA;
        if(headA.next==null && headB.next!=null){
            ListNode temp=headB;
            while(temp.next!=null){
                if(temp.next==headA){
                    return temp.next;
                }
                temp=temp.next;
            }
            return null;
        }
        if(headB.next==null && headA.next!=null){
            ListNode temp=headA;
            while(temp.next!=null){
                if(temp.next==headA){
                    return temp.next;
                }
                temp=temp.next;
            }
            return null;
        }
        
        ListNode tempa=headA;
        ListNode tempb=headB;
        while(tempa.next!=null){
            tempb=headB;
            while(tempb.next!=null){
                if(tempa.next==tempb.next){
                    return tempa.next;
                }
                tempb=tempb.next;
            }
            tempa=tempa.next;
        }
        return null;
    }
}
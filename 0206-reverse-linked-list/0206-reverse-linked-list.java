class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newnode=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newnode;
}
}
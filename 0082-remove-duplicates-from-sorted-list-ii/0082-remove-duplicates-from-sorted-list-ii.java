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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer>fm=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            int d=temp.val;
            fm.put(d,fm.getOrDefault(d,0)+1);
            temp=temp.next;
        }
        head=null;
        temp=head;
        for(int key: fm.keySet()){
            if(fm.get(key)==1){
                if(head==null){
                    head= new ListNode(key);
                    temp=head;
                }
                else{
                    temp.next=new ListNode(key);
                    temp=temp.next;
                }
            }
        }
        return head;
    }
}
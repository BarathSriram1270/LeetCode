
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prevGroupTail = dummy;
        while (head != null) {
            ListNode groupStart = head;
            ListNode groupEnd = getGroupEnd(head, k);
            
            if (groupEnd == null) {
                break;
            }
            
            ListNode nextGroupStart = groupEnd.next;
            groupEnd.next = null;  // Break the group
            
            // Reverse the current group
            prevGroupTail.next = reverseList(groupStart);
            
            // Connect the reversed group to the next group
            groupStart.next = nextGroupStart;
            
            // Update pointers for the next iteration
            prevGroupTail = groupStart;
            head = nextGroupStart;
        }
        
        return dummy.next;
    }
    
    private ListNode getGroupEnd(ListNode start, int k) {
        for (int i = 1; i < k && start != null; i++) {
            start = start.next;
        }
        return start;
    }
    
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        return prev;
    }
}

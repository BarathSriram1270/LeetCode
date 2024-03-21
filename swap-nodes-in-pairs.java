class Solution {
    public ListNode swapPairs(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize pointers for swapping
        ListNode prev = null;
        ListNode current = head;
        
        // Swap pairs of nodes
        while (current != null && current.next != null) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = current;
            
            if (prev == null) {
                head = nextNode;
            } else {
                prev.next = nextNode;
            }
            
            prev = current;
            current = current.next;
        }
        
        return head;
    }
}

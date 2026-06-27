public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next.next.next;
            if(slow==fast) return true;
        }
        return false;

           
    }
}
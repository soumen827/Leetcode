public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast =head;
        ListNode slow = head;
        ListNode t= head;
        if(head==null || head.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return null;
        while(t!=slow){
            slow = slow.next;
            t = t.next;
        }
        return t;
        
    }
}
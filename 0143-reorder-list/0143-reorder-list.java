class Solution {
     public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = head;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
     }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode h2 = slow.next;
        slow.next =null;
        h2 =reverseList(h2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(head!=null && h2!=null){
          temp.next =head;
          temp = temp.next;
          head = head.next;
          temp.next =h2;
           temp = temp.next;
          h2 = h2.next;


        }
        if(h2==null) temp.next = head;
        if(head==null) temp.next =h2; 
        
    }
}
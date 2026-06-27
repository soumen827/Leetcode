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
    public boolean isPalindrome(ListNode head) {
        
        ListNode a= head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode j = reverseList(slow);
        ListNode i = head;
        while(j!=null){
            if(i.val!=j.val) return false;
            i = i.next;
            j = j.next;

        }
        return true;


    }
}
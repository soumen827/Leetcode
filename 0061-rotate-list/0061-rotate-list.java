class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len =0;
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null){
            slow= slow.next;
            len++;

        }
        slow =head;
        k%=len;
        if(k==0) return head;
        for(int i=1;i<=k;i++){
           fast =fast.next;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast =fast.next;

        }
        ListNode newHead = slow.next;
        slow.next =null;
        fast.next= head;
        head = newHead;
        return head;
    }
}
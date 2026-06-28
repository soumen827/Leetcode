class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // int len =0;
        // while(temp!=null){
        //     temp=temp.next;
        //     len++;
        // }
        // int mid = (len/2+1);
        // temp = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

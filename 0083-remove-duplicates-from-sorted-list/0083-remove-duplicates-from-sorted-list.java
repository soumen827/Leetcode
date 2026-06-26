class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        if(b==null) return null;
        while(b!=null){
            if(a.val==b.val) b = b.next;
            else{
                a.next =b;
                a=b;
            }
        }
         a.next =b;
         return head;

    }
}
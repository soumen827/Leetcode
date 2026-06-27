class Solution {
    public ListNode merge(ListNode list1, ListNode list2) {
            ListNode t= new ListNode(100);
            ListNode temp = t;
            ListNode t1 = list1;
            ListNode t2 = list2;
     while(t1!=null && t2!=null){
        if(t1.val<=t2.val){
            temp.next =t1;
            t1 =t1.next;

        }else{
            temp.next = t2;
            t2 = t2.next;
            }
         temp= temp.next;
        }
        if(t1==null) temp.next =t2;
        else if(t2==null)  temp.next =t1;
        return t.next;
    }
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode a = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode b= slow.next;
        slow.next = null;
        a = sortList(a);
        b = sortList(b);
         ListNode ans = merge(a,b);
        return ans;
    }
}    
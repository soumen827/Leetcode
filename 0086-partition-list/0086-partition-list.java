class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode ta =a;
        ListNode tb =b;
        ListNode t = head;
        while(t!=null){
            if(t.val<x){
                ta.next=t;
                ta = ta.next;
            }else{
                tb.next =t;
              
                tb = tb.next;
            }
             t= t.next;
        }
        tb.next =null;
         a= a.next;
         b= b.next;
         
         ta.next =b;
         if(a==null ) return b;
         return a;


    }
}
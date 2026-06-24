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
    public ListNode mergeKLists(ListNode[] lists){
        int n = lists.length;
        if (lists == null || n == 0) return null;
        return mergeLists(lists,0,n-1);
    }

    private ListNode mergeLists(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left]; // only one list

        int mid = left + (right - left) / 2;
        ListNode l1 = mergeLists(lists, left, mid);
        ListNode l2 = mergeLists(lists, mid + 1, right);
        return merge(l1, l2);
    }
}
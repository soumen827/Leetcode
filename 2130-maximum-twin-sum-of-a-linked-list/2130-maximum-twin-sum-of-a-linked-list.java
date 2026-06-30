// class Solution {
//     public ListNode reverseList(ListNode head){
//         ListNode curr = head;
//         ListNode prev = null;
//         ListNode nxt = head;
//         while(curr!=null){
//             nxt = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nxt;
//         }
//         head = prev;
//         return head;
//      }
//     public int pairSum(ListNode head) {
//         ListNode a= head;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         ListNode j = reverseList(slow);
//          int maxsum =0;
//         ListNode i = head;
//         while(j!=null){
//              maxsum = Math.max(maxsum,i.val+j.val);
//              i= i.next;
//              j = j.next;

//         }
//         return maxsum;
        
//     }
// }
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        int max=Integer.MIN_VALUE;
        while(p2!=null){
            int sum=p1.val+p2.val;
            max=Math.max(sum,max);
            p1=p1.next;
            p2=p2.next;
        }
        return max;
        }
}
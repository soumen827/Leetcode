class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = head;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a = null, b = null, c = null, d = null;
        int pos = 1;
        ListNode temp = head;
        while (temp != null) {
            if (pos == left - 1)
                a = temp;
            if (pos == left)
                b = temp;
            if (pos == right)
                c = temp;
            if (pos == right + 1)
                d = temp;
            temp = temp.next;
            pos++;

        }
        if (a != null)
            a.next = null;
        c.next = null;
        reverseList(b);
        if (a != null)
            a.next = c;
        b.next = d;
        if (a == null)
            return c;
        return head;

    }
}
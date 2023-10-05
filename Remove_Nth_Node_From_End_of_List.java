 public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        ListNode prev = slow;
        while(n>0)
        {
            fast = fast.next;
            n--;
        }
        while(fast!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = slow.next;

        return start.next;
    }

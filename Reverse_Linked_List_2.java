public ListNode reverseBetween(ListNode head, int left, int right) {

        Queue<ListNode> q= new LinkedList<>();
        Stack<ListNode> s = new Stack<>();

        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        int p =1;
        int counter = 0;
        while(p<left)
        {
            q.add(head);
            head = head.next;
            p++;
            counter++;
        }
        while(p>=left && p<=right)
        {
            s.add(head);
            head = head.next;
            p++;

        }
        while(head != null)
        {
            q.add(head);
            head = head.next;

        }

        while(counter!=0)
        {
            ans.next = q.remove();
            ans = ans.next;
            counter--;
        }
        while(!s.isEmpty())
        {
            ans.next = s.pop();
            ans = ans.next;

        }
        
        while(!q.isEmpty())
        {
            ans.next = q.remove();
            ans = ans.next;
        }
        ans.next = null;

        return temp.next;
        
    }

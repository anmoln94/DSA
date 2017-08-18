/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

*/

public ListNode swapPairs(ListNode head) {
     ListNode dummy = new ListNode(0);
        dummy.next = head;
        // temp points to dummy in the beginning.
        // {dummy->1->2->3->4->null}
        ListNode temp = dummy;

        while (temp.next != null && temp.next.next != null) {
            // one -> 1
            ListNode first = temp.next;

             //two -> 2
            ListNode second = temp.next.next;

            // 1-> = 2.next = 3;
            first.next = second.next;

            // 2-> = 1
            second.next = first;
            //now dummy should point to 2
            //if the below is not done dummy->1;
            temp.next = second;

            // current was pointing to dummy
            //temp->1 
            temp = first;

            // now { dummy->2->1->3->4 } 
        }
        return dummy.next;
    }
}
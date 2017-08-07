/*Create two pointers fast and slow. Send fast pointer to n positions from front
 * and then move both pointers together till fast reaches end.
 * 
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0);
        slow.next=head;
        ListNode fast = head;
        
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        
        if(fast==null)
            return slow.next.next;
        else
        {
            while(fast!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
        
            slow.next=slow.next.next;
            return head;
        }
        
        
    }
}
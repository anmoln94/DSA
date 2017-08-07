/* create an odd pointer at head , an even pointer at head.next, and a copy of even head 
Then, odd always moves to another odd index by odd.next.next. same case with even.
at the end, the last odd node points to the even head (which we made at the beginning).
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
    public ListNode oddEvenList(ListNode head) {
        
        if(head!=null)
        {
            ListNode odd=head;ListNode even=head.next;ListNode evenhead=even;
            while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
            odd.next=evenhead;
        }
        
        return head;   
    }
}

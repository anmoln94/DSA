/* keep a previous pointer(initially null), and current pointer(intially head)
Base Case check at every iteration: if head is to be deleted, change head to current.next
Otheriwse: prev.next = current.next*/
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr==head && curr.val==val)
            {
                head=curr.next;
                curr=curr.next;
            }
            else if(curr.val==val)
            {
                prev.next=curr.next;
                curr= curr.next; 
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
            
        }
        return head;
    }
}

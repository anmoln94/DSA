/*Figure out how many rounds to move. Assign tail next to head. Calculate how much to rotate (k%length). Move tail length-k times.
Head becomes tail.next. then tail.next becomes null*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        int len=0;
        
        ListNode tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
            len++;
        }
        
        len+=1;
        tail.next=head;
        
        
        k=k%len;
        
        for(int i=0;i<len-k;i++)
        {
            tail=tail.next;
        }
        
        head=tail.next;
        tail.next=null;
        return head;
        
        
    }
}

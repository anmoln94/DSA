/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1= new Stack<Integer>();
        Stack<Integer> s2= new Stack<Integer>();
        
        while(l1!=null)
        {
            s1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            s2.push(l2.val);
            l2=l2.next;
        }
        int sum=0;
        
        ListNode prev=new ListNode(0);;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(!s1.isEmpty())
                sum+=s1.pop();
            if(!s2.isEmpty())
                sum+=s2.pop();
            prev.val=sum%10;
            ListNode curr= new ListNode(sum/10);
            curr.next=prev;
            prev=curr;
            sum/=10;
        }
        return prev.val==0?prev.next:prev;
        
    }
}
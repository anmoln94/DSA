/*make a copy of head. push full linkedlist into stack. then iterate linkedlist and pop simulatenously and check.
if it is not same at any time check if stacks is empty. If it is not return false */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp=head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head!=null)
        {
            if(head.val==stack.peek())
            {
                stack.pop();
                head=head.next;
            }
            else
            {
                break;
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
            return false;
        
    }
}

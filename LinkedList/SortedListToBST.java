/*
Create two pointers fast and slow
Move fast 2x speed of slow
When fast hits null, slow will be at the middle of the list
Create a node using slow
Recursively assign left to toBST(head,slow) which will be less than slow
Recursively assign right to toBST(slow.next,tail) which will be greater than slow
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return toBST(head, null);
    }
    public TreeNode toBST(ListNode head, ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == tail ) return null;
        
        while(fast != tail && fast.next != tail ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode thead = new TreeNode(slow.val);
        thead.left = toBST(head,slow);
        thead.right = toBST(slow.next,tail);
        return thead;
    }
}

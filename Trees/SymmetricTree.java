/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

Solution:

Base Condition:
-Both p and q are null then return true ( means both have same height)
-Either one of the them is null return false(means uneven height)

Else:
-Recursively check in both left and right subtrees and node val is the same 
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null ) return true;
            return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        return (p.val==q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
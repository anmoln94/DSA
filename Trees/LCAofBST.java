/*
-  p and q are in the same subtree (meaning their values are both smaller or both larger than root's).

Recursively check:
- if P.val and q.val both greater than root then return lowestCommonAncestor(root.left, p, q)
- if P.val and q.val both lesser than root then return lowestCommonAncestor(root.right, p, q)

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val) 
            return lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val < q.val) 
            return lowestCommonAncestor(root.right, p, q);
    }
}
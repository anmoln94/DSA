/*
       1
      / \
     2   3
Return 6, since there is a path from 2 to 1 to 3 or 3 to 1 to 2.

Logic is: A path can never go back to nodes it has already visited.
At every node, there is a unique path from its left or right subtree that will have max sum value.
Always return the max of left subtree or right subtree sum back to its parent
(since we care only for that one unique path with the max sum).
*/
class Solution 
{
    int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left));
        int right = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, left + right + node.val); //max value attained at a particular node
        return Math.max(left, right) + node.val;
    }
}

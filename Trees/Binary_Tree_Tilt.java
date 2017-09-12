/*The tilt of a tree node is the absolute difference 
 between sum of all left subtree node values and sum of all right subtree node values.
 Null node has tilt 0.
 Logic is do post order traversal.
 
 */
class Solution {
    int result = 0;
    
    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }
    
    private int postOrder(TreeNode root) {
        if (root == null) return 0;
        
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        
        result += Math.abs(left - right);
        
        return left + right + root.val;  // we add the root val since recursion on return wants everything in subtree below it
    }
}
/* Find the sum of all left leaves in a given binary tree.
 * For given node we check whether its left child is a leaf. If it is the case, we add its value to answer, otherwise recursively call method on left child. 
 * Once we have found a left leaf, we go right at that point.

 */
public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    int ans = 0;
    if(root.left != null) {
        if(root.left.left == null && root.left.right == null) ans += root.left.val;
        else ans += sumOfLeftLeaves(root.left);
    }
    ans += sumOfLeftLeaves(root.right);
    
    return ans;
}
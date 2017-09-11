/* Change every node of the original BST to the original key plus sum of all keys greater than the original key in BST.
 * Since its a BST, at every node only keys to the right subtree at that point are greater than it and should be a part of the sum.
 * Reach the bottom and then keep going up. Keep a running sum.
 */

public class Solution {

    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    
    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;	
        convert(cur.left);
    }
    
}
/*Do inorder traversal as it gives ascending order. 
* Increase count each time u hit a left child as null.
*/
class Solution {
    int count = 0;
    int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k)
    {
    	traverse(root, k);
    	return result;
    }

    public void traverse(TreeNode root, int k) 
    {
    	if(root == null) 
    		return;
    	traverse(root.left, k);
    	count ++;
    	if(count == k) 
    	{
    		result = root.val;
    		return;
    	}
    		
    	traverse(root.right, k);       
    }
}
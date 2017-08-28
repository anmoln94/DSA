//Given a binary tree, return the largest number in each row. Apply DFS (basically pre-order traversal).
public class Solution 
{
	public List<Integer> largestValues(TreeNode root) 
	{
		List<Integer> res = new ArrayList<Integer>();
		helper(root, res, 0);
		return res;
	}

	private void helper(TreeNode root, List<Integer> res, int d) 
	{
		if (root == null) 
		{
			return;
		}
		
		if (d == res.size()) 
		{
			res.add(root.val);	//if no element has been added yet at the current depth
		} 
		else 
		{
			res.set(d, Math.max(res.get(d), root.val));	//If an element has already been added at depth d, compare with it.
		}
		helper(root.left, res, d + 1);
		helper(root.right, res, d + 1);
	}
}
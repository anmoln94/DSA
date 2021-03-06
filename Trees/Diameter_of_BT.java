/* The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
  For every node, length of longest path which pass it = MaxDepth of its left subtree + MaxDepth of its right subtree.
 */

public class Solution {
	int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return max;
	}

	private int maxDepth(TreeNode root) {
		if (root == null) return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max = Math.max(max, left + right);

		return Math.max(left, right) + 1;
	}
}
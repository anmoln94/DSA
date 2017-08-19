/*
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

Solution:
- Recursively check right child first followed by left child
- Add to list only if size is same as level(ensuring only one values gets added per level)
*/

public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        int level = 0;
        recursive(root, output, level);
        return output;
}
public void recursive(TreeNode root, List<Integer> output, int level) {
	if (root == null) {
		return;
	}
	if ((level == output.size())) {
		output.add(root.val);
	}
	recursive(root.right, output, level + 1);
	recursive(root.left, output, level + 1);
}
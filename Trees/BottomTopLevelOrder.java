/*  3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

 */
public List<List<Integer>> levelOrderBottom(TreeNode root) {
	LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
	addLevel(list, 0, root);
	return list;
}

//Do DFS. At each new level, create a new linked list and push the current node value to that list.
private void addLevel(LinkedList<List<Integer>> list, int level, TreeNode node) {
	if (node == null) return;
	if (list.size()-1 < level) list.addFirst(new LinkedList<Integer>());
	list.get(list.size()-1-level).add(node.val);
	addLevel(list, level+1, node.left);
	addLevel(list, level+1, node.right);
}
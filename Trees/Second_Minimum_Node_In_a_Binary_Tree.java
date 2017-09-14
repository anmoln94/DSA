//Do dfs. Add unique values to sortedset. Return the 2nd element.
public int findSecondMinimumValue(TreeNode root) {
	if (root == null) {
		return -1;
	}
	SortedSet<Integer> set = new TreeSet<>();
	dfs(root, set);
	Iterator<Integer> iterator = set.iterator();
	int count = 0;
	while (iterator.hasNext()) {
		count++;
		int result = iterator.next();
		if (count == 2) {
			return result;
		}
	}
	return -1;
}

private void dfs(TreeNode root, SortedSet<Integer> set) {
	if (root == null) {
		return;
	}
	set.add(root.val);
	dfs(root.left, set);
	dfs(root.right, set);
	return;
}
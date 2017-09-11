/*Return a list of roots of duplicate subtrees.
 * Do post order traversal (reason being u can build from bottom to top).
 * Keep a hashmap with each subtree(as a string) along with its freq.
 * Each time you find a subtree, check if it already exists. If not, put its freq count as 1.
*/
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> res = new LinkedList<>();
    postorder(root, new HashMap<>(), res);
    return res;
}

public String postorder(TreeNode cur, Map<String, Integer> map, List<TreeNode> res) {
    if (cur == null) return "#";  
    String serial = cur.val + "," + postorder(cur.left, map, res) + "," + postorder(cur.right, map, res);
    if (map.getOrDefault(serial, 0) == 1) res.add(cur);
    map.put(serial, map.getOrDefault(serial, 0) + 1);
    return serial;
}
}
/*At each recursive call, at the root.val to the path string. 
If both left and child are null, print the path.
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    public List<String> binaryTreePaths(TreeNode root) 
    {
        if (root != null) 
            searchBT(root, "");
        return answer;
    }
    private void searchBT(TreeNode root, String path) 
    {
        if (root.left == null && root.right == null) 
            System.out.println(path);
        if (root.left != null) 
            searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) 
            searchBT(root.right, path + root.val + "->", answer);
    }
}

/* Given a BST(or BT) and target number, return true if there exist two elements in the BST(or BT) such that their sum is equal to the given target.
 * Use a hashset to save the values of the nodes in the BST(or BT). 
 * Each time when we insert the value of a new node into the hashset, we check if the hashtable contains k - node.val. 
 */
public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, set, k);
    }
    
    public boolean dfs(TreeNode root, HashSet<Integer> set, int k){
        if(root == null)return false;
        if(set.contains(k - root.val))return true;
        set.add(root.val);
        return dfs(root.left, set, k) || dfs(root.right, set, k);
    }
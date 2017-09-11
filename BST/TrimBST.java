/* Given lower and upper boundaries of the values that are valid [L,R], trim the BST.
 * Logic is if you find a value out of bounds, if its lesser than L, replace it with first valid right child.
 * if its greater than R, replace it with first valid left child.
 */
public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;
        
        if (root.val < L) return trimBST(root.right, L, R);
        if (root.val > R) return trimBST(root.left, L, R);
        
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        
        return root;
    }
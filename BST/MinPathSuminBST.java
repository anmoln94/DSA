package BST;
/*recursively find all paths(sums) from root to leaf. 
 * Calculate left sum and right sum for each node, and return the smaller
 * of the two back to the parent.
 * This way the the root node will be returned the smallest sum from below.
 * 
 */
public static int minPathSum(TreeNode root) {
        if(root == null) return 0;
        int sum = root.val;
        int leftSum = Integer.MAX_VALUE;
        int rightSum = Integer.MAX_VALUE;
        if(root.right==null && root.left==null) {
            return sum;
        }else{

            if(root.left!=null){
                leftSum = minPathSum(root.left);
            }
            if (root.right!=null){
                rightSum = minPathSum(root.right);
            }
            if(leftSum < rightSum){
                sum += leftSum;
            }else{
                sum += rightSum;
            }
        }

        return sum;
    }
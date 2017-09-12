/*Return the minimum absolution difference between any two nodes in the tree.

Logic is use a TreeSet: its a hashset represented as a tree for faster retrieval. 
It gives functions like floor and ceiling which will be used to calculate difference with its neighbours.

Each time a unique value comes, put it into the set and calculate its diff with its neighbours (Neighbours is the first greater and first lesser number). 
If a repetition comes( means min diff will be 0, return 0).
*/

class Solution {
    TreeSet<Integer> set = new TreeSet<>();
    int min = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        if (!set.isEmpty()) {
            if (set.floor(root.val) != null) {	//set.floor for a given val gives the number just lower than the val in the set
                min = Math.min(min, root.val - set.floor(root.val));
            }
            if (set.ceiling(root.val) != null) { //set.ceiling for a given val gives the number just higher than the val in the set
                min = Math.min(min, set.ceiling(root.val) - root.val);
            }
        }
        
        if(!set.add(root.val))
        	return 0;
        
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        
        return min;
    }
}
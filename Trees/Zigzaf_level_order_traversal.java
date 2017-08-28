/* Print each left to right, the next row right to left, basically keep alternating.
 * Keep a boolean variable. If it is true, then print left to right else right to left. Keep flipping its value at each level.
 * Use a queue to store nodes. If boolean is true, then we just add the elements in the order of queue.
 * If it is false, we keep appending the list at 0th position ( basically reversing). 
 */
public class Solution 
{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
	{
		List<List<Integer>> res = new ArrayList<>();
		if(root == null) return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		boolean order = true;
		int size = 1;

		while(!q.isEmpty()) 
		{
			List<Integer> tmp = new ArrayList<>();
			for(int i = 0; i < size; ++i) 
			{
				TreeNode n = q.poll();
				if(order) 
				{
					tmp.add(n.val);
				} 
				else 
				{
					tmp.add(0, n.val);	//appending to front of list everytime stores elements right to left.
				}
				if(n.left != null) q.add(n.left);
				if(n.right != null) q.add(n.right);
			}
			res.add(tmp);
			size = q.size();
			if(order)
				order=false;
			else
				order=true;
		}
		return res;
	}
}
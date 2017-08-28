/*Given an array generate all permutations of it.
 * Do it recursively (generate all, then backtrack, change one number, again generate all ...)
 * We have a for loop, so that we can use all elements of the array.
 * Note the array has no duplicates.
 */
class Solution 
{
	public List<List<Integer>> permute(int[] nums) 
	{
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums)
	{
		if(tempList.size() == nums.length)
		{
			list.add(new ArrayList<>(tempList));
		} 
		else
		{
			for(int i = 0; i < nums.length; i++)
			{ 
				if(tempList.contains(nums[i])) 
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
				/*As length of list at every recursive level increases, once you have generated all 
				 * combinations at final level, u backtrack on level and remove the last character
				 * at that level , and again form permutations.
				 */
			}
		}
	}
}
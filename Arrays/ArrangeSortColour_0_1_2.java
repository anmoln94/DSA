/* Given an array of 0,1 and 2, sort in a way such that all 0 occur first followed by 1 then 2.
 * Keep 2 pointers one for 0's(beginning of array) and and one for 2's(end of array).
 * If you sort 0's and 2's, automatically 1's will be in the middle.
 * Each time you can a 0 at an ith index, swap it with the next position of most recently found index of 0. 
 * Same thing with 2's.
 */
class Solution {
	public void sortColors(int[] nums) 
	{
		int j = 0, k = nums.length - 1;
		for (int i = 0; i <= k; i++) 
		{
			if (nums[i] == 0)
				swap(nums, i, j++);	
			else if (nums[i] == 2)
				swap(nums, i--, k--);	//We do i-- so that if in both positions there were 2's, the new 2 at ith index
										//gets used to swap a k-1 index.
		}
	}

	public void swap(int[] nums, int start, int end) 
	{

		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;

	}

}
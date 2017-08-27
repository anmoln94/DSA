/* Apply Binary search, except that since the array might be rotated, low might not be the smallest element.
 * So compare target with mid, low and high at each step to know whether to update low or high.
 * 
 * The original array is sorted, but the input given to the method might be rotated.
 */
public class Solution {
	public int search(int[] A, int target) 
	{
		if (A.length == 0)
			return -1;
		int lo = 0;
		int hi = A.length - 1;
		while (lo < hi) 
		{
			int mid = (lo + hi) / 2;
			if (A[mid] == target)
				return mid;

			if (A[lo] <= A[mid]) 	//input is rotated
			{
				if (target >= A[lo] && target < A[mid]) 	
				{
					hi = mid - 1;
				} 
				else 
				{
					lo = mid + 1;
				}
			} 
			else 		//input was not rotated so its a normal binary search case
			{
				if (target > A[mid] && target <= A[hi]) 
				{
					lo = mid + 1;
				} 
				else 
				{
					hi = mid - 1;
				}
			}
		}
		return A[lo] == target ? lo : -1;	//This is done if while loop ends, means low=high. Search was reduced to two elements.
											//If the target was the second element, it would not have been caught since low became = high by then.

	}
}
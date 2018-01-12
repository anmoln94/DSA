/* Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
Input: [4,2,3] Output: True
Explanation: You could modify the  4 to 1
 
Logic: apply greedy approach. 
If you find arr[i-1]>arr[i] and arr[i-2]>arr[i], make arr[i] = arr[i-1],  (instead of changing 2 elements (i-1 and i-2 to i), change only arr[i])
else arr[i-1] = arr[i] (we change arr[i-1] to arr[i] and not vice versa is because we assume further down the array is proper)
 */
public boolean checkPossibility(int[] nums) 
{
	int cnt = 0;                                                                    //the number of changes
	for(int i = 1; i < nums.length && cnt<=1 ; i++){
		if(nums[i-1] > nums[i]){
			cnt++;
			if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
			else nums[i] = nums[i-1];                                                //have to modify nums[i]
		}
	}
	return cnt<=1; 
}
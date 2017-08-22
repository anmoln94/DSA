/* Do 2 binary search, once to find start index of target, and then again to find end index of target.
 * Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4]. //array is sorted
 * While checking right index of range, we need to mid = (i+j)/2 + 1, since if we do not, it may happen that i==mid since 
  divide by 2 always rounds of to the lower number, and infinite loop will happen. This will never happen in case of
  finding start index of range since j can never become = mid.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] ret = {-1,-1};
        if (nums.length==0)
            return ret;
    int i = 0; int j = nums.length - 1;
  
    // Search for the left one
    while (i < j)
    {
        int mid = (i + j) /2;
        if (nums[mid] < target) i = mid + 1;
        else j = mid;
        
    }
    
    if (nums[i]!=target) 	//basically the target was not found in an array
    	return ret;
  

        ret[0] = i;
    
    
    // Search for the right one
    j = nums.length-1;  	// We don't have to set i to 0 the second time.
    while (i < j)
    {
        int mid = (i + j) /2 +1  ;		// Make mid biased to the right
        if (nums[mid] > target) j = mid - 1;  
        else i = mid;					// So that this won't make the search range stuck.
    }
    ret[1] = j;
    return ret; 
        
    }
}
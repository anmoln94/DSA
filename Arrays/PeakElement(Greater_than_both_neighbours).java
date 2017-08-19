/* Starting from beginning of the array, as soon as we encounter nums[i]>nums[i+1] we have to return since the nums[i]>nums[i-1]
 * will already have been satisfied.
 * If you reach the end of the array, it means the last element is greater than second last element, so we just return 
 * the index of the last element.
 */

public class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1])
                return i;	//index of peak element is to be returned
        
        return nums.length-1;
    }
    
}
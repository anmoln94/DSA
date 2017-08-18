/*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
*Check if current number was greater than the number at i-1 index. If yes, then increase the pointer of 'i'.
*If we did not put i=0 condition, there would be out of bounds exception for n>nums[i-1].
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums)
        {
            if(i==0 || n>nums[i-1])
            {
                nums[i++]=n;
            }
        }
        
        return i;
    }
}
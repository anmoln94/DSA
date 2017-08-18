/*Start from end of both array. Compare both array elements and move the pointer of the array from which previous max value was selected.
 * It might happen that one array finishes before the other one. Hence to fill the left out elements,
 * we have the 2nd and 3rd while loops.
 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = m-1;
        int j= n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else
            {
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }
    
        while(i>=0)
        {
            nums1[k--]=nums1[i--];
        }
    }
}
/*If array contains any duplicate return false. Create a hashset ( hashset cannot have duplicates).
 * If you try adding a duplicate, the .add() method will return false.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
        
    }
}
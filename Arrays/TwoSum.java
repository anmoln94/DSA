/*Create a hashmap (key= array element, value = its array index).
 * Check if map contains target - nums[i]. if yes, then return both the index
 * else put it in the hashmap. If at the end result array is empty, means no solution found.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        int[] res= new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                res[1]=i;
                res[0]=map.get(target-nums[i]);
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
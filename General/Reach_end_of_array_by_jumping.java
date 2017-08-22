/*Given an array of max possible jumps, can you reach the end?
 * Start from second last index, check if you can reach last index from here. 
 * If yes, then check if you can reach 2nd last index from 3rd last index, and so on.
 */
class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int last=n-1,i,j;
    for(i=n-2;i>=0;i--){
        if(i+nums[i]>=last)last=i;
    }
    return last<=0;
        
    }
}
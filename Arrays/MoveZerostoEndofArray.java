/* At every instant, 'j'th index keeps track of the most recently found index where a non-zero element was found.
 * In case a zero occurs, 'j' will stop updating itself as the 'if' condition wont be executed. 
 * So from the last time j++ happened, j would have moved to the position of the 'zero' occuring index.
 * At every index, if it is a non zero value, you swap it with the index of 'j'.
 * When there is no zero until the current index 'i', j will be equal to i, so even if you swap the array remains same.
 * When a zero occured, j will be having that index value and swapping the current non zero value with that index will
 * move all the zeros to the end of the array.
 */

public class Solution {
    public void moveZeroes(int[] nums) {

    int j = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }
    }
    }
}
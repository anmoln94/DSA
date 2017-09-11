/* Given a matrix represented by a two-dimensional array, and r and c representing the row number and column number of the wanted reshaped matrix.
 * We put numbers in the result array, we fix a particular row and keep on incrementing the column numbers till we reach 'c'.
 * At this moment, we update the row index by incrementing it and reset the column index to start from 0 again. 
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}
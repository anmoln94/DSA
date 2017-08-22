/*Rows and columns are sorted in ascending order. Start searching in top right corner.
 * If val < mat[rows][col], means it cant be in that column. Hence col--.
 * If val > mat[rows][col], means it cant be in that row. Hence, row++.
 * Complexity = O(rows+col) 
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}
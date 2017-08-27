/* Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

Use the first column and the first row as marker (later will be used to set whole row and col to 0):

Scan the matrix, and if you find a 0 at [i][j], label matrix[i][0] = 0, label matrix[0][j] = 0.

Base condition 1: If we find the first row has a zero, mark a boolean row = true.
Base condition 2: If the first column has a zero, mark a boolean col = true.

By the markers on the first row and first col, set the other columns and rows to zeros. (first row and first column already handled)

According to booleans row and col, decide whether to set first row and column to zeros (base condition)
  
*/

public class Solution 
{
	public void setZeroes(int[][] matrix) 
	{
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return;
		int m = matrix.length, n = matrix[0].length;
		boolean row = false, col = false;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
					if (i == 0)
						row = true;
					if (j == 0)
						col = true;
				}
			}
		}
		for (int i = 1; i < m; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < n; j++)
					matrix[i][j] = 0;
			}
		}
		for (int j = 1; j < n; j++) {
			if (matrix[0][j] == 0) {
				for (int i = 1; i < m; i++)
					matrix[i][j] = 0;
			}
		}
		if (row) {
			for (int j = 0; j < n; j++)
				matrix[0][j] = 0;
		}
		if (col) {
			for (int i = 0; i < m; i++)
				matrix[i][0] = 0;
		}
	}
}
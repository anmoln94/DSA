/* Given the dimensions of the matrix mxn , and a 2d array of operations to be perform return
 * the count of the max integer in that matrix after doing the operations.
 * The operations of [2,2] means , for all i,j where i<=2 and j<=2, ,increment mat[i][j].
e.g:-

m = 3, n = 3
operations = [[2,2],[3,3]]
Output: 4
Explanation: 
Initially, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]

After performing [2,2], M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

After performing [3,3], M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

So the maximum integer in M is 2, and there are four of it in M. So return 4. 

LOGIC IS THAT AFTER ALL OPERATIONS, MAX INTEGER VALUE IS THE OVERLAPPING MATRIX ACROSS ALL OPERATIONS.
 */
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op: ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
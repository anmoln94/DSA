// Islands = number of 1's. For each island check right and bottom neighbour. 
// The perimeter = 4*islands - 2*neighbours. We subtract neighbours to remove internal edges.
public class Solution {
	public int islandPerimeter(int[][] grid) {
		int islands = 0, neighbours = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					islands++; // count islands
					if (i < grid.length - 1 && grid[i + 1][j] == 1)
						neighbours++; // count down neighbours
					if (j < grid[i].length - 1 && grid[i][j + 1] == 1)
						neighbours++; // count right neighbours
				}
			}
		}

		return islands * 4 - neighbours * 2;
	}
}
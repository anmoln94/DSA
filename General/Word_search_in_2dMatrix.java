/*
 Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
 word = "ABCCED", -> returns true,
 
 
Keep applying DFS(marking each letter visited by doing letter^256) till you form the word. 
If you encounter a letter from where DFS did not retrieve the word, unmark that letter
so that it can be used again with some other path to potentially find the word.

 */
class Solution {
	public boolean exist(char[][] board, String word) 
	{
		char[] w = word.toCharArray();
		for (int x = 0; x < board.length; x++) 
		{
			for (int y = 0; y < board[x].length; y++) 
			{
				if (exist(board, x, y, w, 0))
					return true;
			}
		}
		return false;
	}

	private boolean exist(char[][] board, int x, int y, char[] word, int i) 
	{
		if (i == word.length)
			return true;
		if (x < 0 || y < 0 || x == board.length || y == board[x].length)
			return false;
		if (board[x][y] != word[i])
			return false;
		board[x][y] ^= 256;
		boolean exist = exist(board, x, y + 1, word, i + 1)
				|| exist(board, x, y - 1, word, i + 1)
				|| exist(board, x + 1, y, word, i + 1)
				|| exist(board, x - 1, y, word, i + 1);
		board[x][y] ^= 256;
		return exist;
	}
}
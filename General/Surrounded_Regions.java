/*  X X X X
	X O O X
	X X O X
	X O X X   becomes
	
	
	X X X X
	X X X X
	X X X X
	X O X X      Any 'O' connected to a boundary 'O' is not considered to be surrounded.
	
	
	Logic is to mark all the boundary 'O' as '1' temporarily, and all their neighbouring 'O' also as '1' 
	since these will not considered to be surrounded. Neighbours are checked using recursion.
	
	Once all non surrounded 'O' are marked as 1, iterate through matrix and mark all remaining 'O' as 'X'.
	At the end, convert all 1 back to 'O'.

 */
class Solution {
    public void solve(char[][] board) {
        
       int i,j;
        int row=board.length;
        if(row==0)
        	return;
        int col=board[0].length;

		for(i=0;i<row;i++){
			check(board,i,0,row,col);			//Leftmost column elements
			if(col>1)
				check(board,i,col-1,row,col);	//Rightmost column elements
		}
		for(j=1;j+1<col;j++){				//Topmost Row elements
			check(board,0,j,row,col);
			if(row>1)
				check(board,row-1,j,row,col);		//Bottommost Row elements
		}
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				if(board[i][j]=='O')
					board[i][j]='X';
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				if(board[i][j]=='1')
					board[i][j]='O';
    }
	void check(char[][] board,int i,int j,int row,int col){	//Checks neighbours for every non surrounded 'O'
		if(board[i][j]=='O'){
			board[i][j]='1';
			if(i>1)
				check(board,i-1,j,row,col);
			if(j>1)
				check(board,i,j-1,row,col);
			if(i+1<row)
				check(board,i+1,j,row,col);
			if(j+1<col)
				check(board,i,j+1,row,col);
		}
	}
}
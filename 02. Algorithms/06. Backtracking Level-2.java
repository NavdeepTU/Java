class Solution {

    public static boolean solveSudokuHelper(char[][] board) {

        boolean solved = true;
        int row = -1, col = -1;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    solved = false;
                }
            }
        }

        if(solved) {
            return true;
        }

        for(int i=1; i<=9; i++) {
            char val = (char)(i + '0');
            if(isValid(board, row, col, val)) {
                board[row][col] = val;
                if(solveSudokuHelper(board))
                    return true;
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static boolean isValid(char[][] board, int row, int col, char val) {
        // col
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == val) {
                return false;
            }
        }

        // row
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == val) {
                return false;
            }
        }

        // submatrix
        int rowStart = row - (row % 3);
        int colStart = col - (col % 3);
        for(int i=rowStart; i<rowStart+3; i++) {
            for(int j=colStart; j<colStart+3; j++) {
                if(board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
    	char[][] board = {{'5','3','.','.','7','.','.','.','.'},
    					  {'6','.','.','1','9','5','.','.','.'},
    					  {'.','9','8','.','.','.','.','6','.'},
    					  {'8','.','.','.','6','.','.','.','3'},
    					  {'4','.','.','8','.','3','.','.','1'},
    					  {'7','.','.','.','2','.','.','.','6'},
    					  {'.','6','.','.','.','.','2','8','.'},
    					  {'.','.','.','4','1','9','.','.','5'},
    					  {'.','.','.','.','8','.','.','7','9'}};
        solveSudokuHelper(board);
        for(int i=0; i<board.length; i++) {
        	for(int j=0; j<board[0].length; j++) {
        		System.out.print(board[i][j] + " ");
        	}
        	System.out.println();
        }
    }
}
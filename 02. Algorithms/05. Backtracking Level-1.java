// Backtracking -> Find all Possible Solutions and then use the one you want
import java.util.List;
import java.util.ArrayList;

class Backtracking {
	
	// Print permutations of a given String -> O(n*n!)
	public static void printPermutation(String str, String perm, int idx) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPermutation(newStr, perm + currChar, idx+1);
		}
	}
	
	// Given a N*N chessboard, place N queens on it such that all of them are safe
	// Time complexity -> O(n^n)
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<List<String>>();
		char[][] board = new char[n][n];
		helper(board, allBoards, 0);
		return allBoards;
	}
	
	public static void helper(char[][] board, List<List<String>> allBoards, int col) {
		
		// base condition -> when all queens placed
		if(col == board.length) {
			saveBoard(board, allBoards);
			return;
		}
		
		
		for(int row=0; row<board.length; row++) {
			if(isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper(board, allBoards, col+1);
				board[row][col] = '.';
			}
		}
	}
	
	public static boolean isSafe(int row, int col, char[][] board) {
		
		
		// horizontal
		for(int j=0; j<board.length; j++) {
			if(board[row][j] == 'Q') {
				return false;
			}
		}
		
		// vertical
		for(int i=0; i<board.length; i++) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		
		// upper left
		int r = row;
		for(int c=col; c>=0 && r>=0; c--, r--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		// lower left
		r = row;
		for(int c=col; c>=0 && r<board.length; r++, c--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		return true;
	}
	
	public static void saveBoard(char[][] board, List<List<String>> allBoards) {
		String row = "";
		List<String> boardStr = new ArrayList<String>();
		
		for(int i=0; i<board.length; i++) {
			row = "";
			for(int j=0; j<board.length; j++) {
				if(board[i][j] == 'Q') 
					row += 'Q';
				else
					row += ".";
			}
			boardStr.add(row);
		}	
		
		allBoards.add(boardStr);
	}
	
	public static void main (String[] args) {
		String str = "ABC";
		//printPermutation(str, "", 0);
		List<List<String>> allBoards = solveNQueens(4);
		for(int i=0; i<allBoards.size(); i++) {
			for(int j=0; j<allBoards.get(i).size(); j++)
				System.out.println(allBoards.get(i).get(j));
			System.out.println();
		}
	}
}
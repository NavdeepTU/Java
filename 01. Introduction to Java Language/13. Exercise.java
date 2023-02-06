import java.util.*;

class Exercise2DArrays {
	
	// spiral order traversal of a 2D array
	public static void printSpiralOrderTraversal(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int top = 0, left = 0, right = m-1, bottom = n-1;
		int k = 0;
		while(k < n * m) {
			for(int i=left; i<=right; i++) {
				System.out.print(matrix[top][i] + " ");
				k += 1;
			}
			top = top + 1;
			if(k >= n*m)
				break;
			for(int i=top; i<=bottom; i++) {
				System.out.print(matrix[i][right] + " ");
				k += 1;
			}
			right = right - 1;
			if(k >= n*m)
				break;
			for(int i=right; i>= left; i--) {
				System.out.print(matrix[bottom][i] + " ");
				k += 1;
			}
			bottom = bottom - 1;
			if(k >= n*m)
				break;
			for(int i=bottom; i>=top; i--) {
				System.out.print(matrix[i][left] + " ");
				k += 1;
			}
			left = left + 1;
		}
	}
	
	// print transpose of a matrix
	public static void printTranspose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int j=0; j<cols; j++) {
			for(int i=0; i<rows; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		int[][] matrix = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15}};
		// printSpiralOrderTraversal(matrix);
		printTranspose(matrix);
	}
}
// Syntax
// type[][] arrayName = new type[rows][columns];

import java.util.*;

class TwoDArrays {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] numbers = new int[rows][cols];
		
		// taking input from user
		for(int i=0; i<rows; i++) { // rows
			for(int j=0; j<cols; j++) { // cols
				numbers[i][j] = sc.nextInt();
			}
		}
		
		// output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		// Search for a given number x and print the indices at which it occurs.
		System.out.print("Enter search value ");
		int x = sc.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(numbers[i][j] == x)
					System.out.println("x found at locations (" + i + "," + j + ")");
			}
		}
	}
}
// Syntax of arrays
// type[] arrayName = new type[size];

import java.util.*;

class Arrays {
	public static void main(String[] args) {
		
		// int[] marks = new int[3];
		int marks[] = new int[3];
		
		marks[0] = 97; // phy
		marks[1] = 98; // chem
		marks[2] = 95; // eng
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		// printing using loop
		
		for(int i=0; i<3; i++) {
			System.out.println(marks[i]);
		}
		
		// Memory allocation in case of arrays happens in linear fashion
		
		// Another way array declare kare ka
		int ma[] = {97, 98, 95}; // jab humme pata ho kitne aur konse elements store karwane hai
		
		// User se input lena ho size ka
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] m = new int[size];
		
		// input using for loop
		for(int i=0; i<size; i++) {
			m[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(m[i]); // by default zeros store hoti hai har index pe
		}
		
		// Search for a given number x and print the index at which it occurs
		System.out.print("Enter the search value ");
		int searchValue = sc.nextInt();
		for(int i=0; i<m.length; i++) {  // m.length -> size of m
			if(m[i] == searchValue) {
				System.out.println("Value present at index " + i);
			}
		}
		// Above algorithm is known as linear search in CS
	}
}
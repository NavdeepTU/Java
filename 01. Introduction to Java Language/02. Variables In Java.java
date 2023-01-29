import java.util.*;
class Main {
	public static void main(String[] args) {
		// Output
		System.out.println("Hello World with Java");	// cursor will print and go to next line for printing
		System.out.print("Hello World with Java\n");  // Another way to go to next line
		System.out.print("Hello World with Java"); 
		System.out.println();
		System.out.print("Hello World with Java\nfrom\nApni Kaksha"); 
		System.out.println();
		/*
			Hello World with Java
			Hello World with Java
			Hello World with Java
			Hello World with Java
			from
			Apni Kaksha
 		*/
			
		// Exercise
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		/* 
			*
			**
			***
			****
		*/
		
		// Variables
		String name = "tony stark";	
		int age = 48;
		double price = 25.25;
		int a = 25;
		int b = 10;
		
		b = 20;	// Variables value can be changed in future
		name = "Sunil";
		
		/*	Data Types 
		 *	Primitive Data Types :           Non-Primitive Data Types :
		 *	byte (1 byte)                    String
		 *	short                            Array     
		 *	char (2 bytes)					 Class
		 *	boolean (1 byte)                 Object
		 *	int (4 bytes)                    Interface
		 *	long (8 bytes)
		 *	float (4 bytes)
		 *	double (8 bytes)
		*/
		int c = 10;
		int d = 25;
		int sum = a + b; 
		System.out.println(sum);	// 45
		int diff = d - c;
		System.out.println(diff);	// 15
		int mul = c * d;
		System.out.println(mul);	// 250
		
		// Calculation in java goes from left to right
		
		// Input
		Scanner sc = new Scanner(System.in);
		//String myName = sc.next();	// will take input till first space
		String myName = sc.nextLine();	// will read complete line
		// nextInt()
		// nextFloat()
		System.out.println(myName);	// Navdeep Sharma
		
		// Exercise 1
		int e = sc.nextInt();	// 10
		int f = sc.nextInt();	// 20
		int sumNew = e + f;
		System.out.println(sumNew);	// 30
		
		// Exercise 2
		// Make a program that takes the radius of a circle as input, 
		// calculates its radius and area and prints it as output to the user.
		int radius = sc.nextInt();
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * radius * radius;
		System.out.println(perimeter);	// 31.4
		System.out.println(area);	 // 78.5
		
		// Exercise 3
		// Make a program that prints the table of a number that is input by the user. 
		int num = sc.nextInt();	// 12
		System.out.println(num * 1);	 // 12
		System.out.println(num * 2);	// 24 
		System.out.println(num * 3);	// 36
		System.out.println(num * 4);	// 48
		System.out.println(num * 5);	// 60
		System.out.println(num * 6);	// 72
		System.out.println(num * 7);	// 84
		System.out.println(num * 8);	// 96
		System.out.println(num * 9);	// 108
		System.out.println(num * 10);	// 120
	}
}

import java.util.*;
class Functions {
	// Functions name -> using camel casing
	public static void printMyName(String name) {
		System.out.println(name);
		return;
	}
	
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int calculateProduct(int a, int b) {
		return a * b;
	}
	
	public static void printFactorial(int n) {
		if(n < 0) {
			System.out.println("Invalid number");
			return; // return statement yaha pe zaruri hai bcoz humme next lines nhi execute karwani
		}
		
		int factorial = 1;
		
		for(int i=n; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		// agar return type void hai to return statement not needed
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		printMyName(name); // function ko call kiya
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = calculateSum(a, b);
		System.out.println("Sum of 2 numbers is " + sum);
		
		System.out.println("Product of 2 numbers is " + calculateProduct(a, b));
		
		// Find factorial of a number
		int n = sc.nextInt();
		printFactorial(n);
	}
	// Functions -> block of code that directly gets called from within any other function
	// Methods -> block of code that gets called using class objects
}
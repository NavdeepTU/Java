// A function that calls itself is called recursive function.
import java.util.*;

class RecursionLevel1 {
	
	// Print numbers from n to 1
	public static void printNumbRev(int n) {
		
		if(n == 0)
			return;
		
		System.out.println(n);
		printNumbRev(n-1);
	}
	
	// Print numbers from 1 to 5
	public static void printNumb(int n) {
		
		if(n == 6)
			return;
		
		System.out.println(n);
		printNumb(n+1);
	}
	
	// Print sum of first n natural numbers
	public static void printSum(int i, int n, int sum) {
		
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		
		sum += i;
		printSum(i+1, n, sum);
		System.out.println(i);
	}
	
	// Print factorial of a number n
	public static int calcFactorial(int n) {
		
		if(n == 1 || n == 0)
			return 1;
		
		int factNm1 = calcFactorial(n-1);
		int factN = n * factNm1;
		return factN;
	}
	
	// Print the fibonacci sequence till nth term
	public static void printFib(int a, int b, int n) {
		
		if(n == 0)
			return;
		
		int c = a + b;
		System.out.println(c);
		printFib(b, c, n-1);
	}
	
	// Print x^n (stack height = n)
	public static int calcPower(int x, int n) {
		
		if(n == 0)  // base case 1
			return 1;
		if(x == 0) // base case 2
			return 0;
		
		int xPowNm1 = calcPower(x, n-1);
		int xPowN = x * xPowNm1;
		return xPowN;
	}
	
	// Print x^n (stack height = logn)
	public static int calcPowerLogN(int x, int n) {
		
		if(n == 0)  // base case 1
			return 1;
		if(x == 0) // base case 2
			return 0;
		
		// if n is even
		if(n % 2 == 0) {
			return calcPower(x, n/2) * calcPower(x, n/2);
		} else {
			return calcPower(x, n/2) * calcPower(x, n/2) * x;
		}
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//printNumbRev(n);
		//printNumb(1);
		//printSum(1, n, 0);
		//int ans = calcFactorial(n);
		//System.out.println(ans);
		//int a = 0, b = 1;
		//System.out.println(a);
		//System.out.println(b);
		//printFib(a, b, n-2);
		int x = 2;
		//int ans = calcPower(x, n);
		int ans = calcPowerLogN(x, n);
		System.out.println(ans);
	}
}
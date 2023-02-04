import java.util.*;
class FucctionsExercise {
	
	// average of 3 numbers
	public static void printAverage(int a, int b, int c) {
		double avg = (a + b + c)/3.0;
		System.out.println("Average is " + avg);	
	}
	
	// printing sum of all odd numbers from 1 to n
	public static void printOddSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%2 != 0)
				sum += i;
		}
		System.out.println(sum);
	}
	
	// returning greater of 2 numbers
	public static int greaterOfTwo(int a, int b) {
		if(a >= b)
			return a;
		else
			return b;
	}
	
	// returning circumference of a circle
	public static double getCircumference(int r) {
		double circumference = 2 * (22/7.0) * r;
		return circumference;
	}
	
	// eligible to vote
	public static boolean isEligibleToVote(int age) {
		if(age > 18) 
			return true;
		else
			return false;
	}
	
	// program to enter the numbers till the user wants and at the end
	// it should display the count of positive, negative and zeros entered.
	public static void printPositiveNegativeZeros(int n) {
		Scanner sc = new Scanner(System.in);
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num > 0)
				positiveCount = positiveCount + 1;
			else if(num < 0)
				negativeCount = negativeCount + 1;
			else if(num == 0)
				zeroCount = zeroCount + 1;
		}
		System.out.println("Positive Count " + positiveCount);
		System.out.println("Negative Count " + negativeCount);
		System.out.println("Zero Count " + zeroCount);
	}
	
	// value of one number raised to the power of another
	public static void power(int x, int n) {
		long result = 1;
		for(int i=1; i<=n; i++) {
			result = result * x;
		}
		System.out.println(result);
	}
	
	// GCD of 2 numbers
	public static int getGCD(int a, int b) {
		if(b > a) {
			int t = a;
			a = b;
			b = t; 
		}
		while(true) {
			if(a%b == 0)
				return b;
			else {
				int t = b;
				b = a%b;
				a = t;
			}
		}
		//return -1;
	}
	
	// print Fibonacci series
	public static void printFibonacci(int n) {
		int prevPrev = 0;
		int prev = 1;
		for(int i=0; i<=n; i++) {
			if(i == 0) {
				System.out.print(i + " ");
			} else if(i == 1) {
				System.out.print(i + " ");
			} else {
				int t = prevPrev + prev;
				System.out.print(t + " ");
				prevPrev = prev;
				prev = t;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		
		//printAverage(a, b, c);
		//printOddSum(a);
		//int greater = greaterOfTwo(a, b);
		//System.out.println("Greater number : " + greater);
		//System.out.println("Circumference is : " + getCircumference(5));
		//boolean isElligible = isEligibleToVote(a);
		//if (isElligible)
			//System.out.println("Elligible to Vote");
		//else
			//System.out.println("Not Elligible to Vote");
		//printPositiveNegativeZeros(a);
		//power(a, b);
		//System.out.println("GCD of numbers is " + getGCD(a, b));
		printFibonacci(a);
	}
}
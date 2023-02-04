import java.util.*;
class LoopsExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Print all even numbers till n
		int n = sc.nextInt();
		for(int i=0; i<=n; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// Infinite loop
		// for(;;) {
			 // System.out.println("Apna College");
		// }
		
		int ip, marks;
		do {
			ip = sc.nextInt();
			if(ip == 1){
				marks = sc.nextInt();
				if(marks >= 90) {
					System.out.println("This is Good");
				} else if(marks >= 60) {
					System.out.println("This is also Good");
				} else if(marks >= 0) {
					System.out.println("This is Good as well");
				} else {
					System.out.println("Invalid marks entry");
				}
			} 
		} while(ip == 1);
		
		// Print if a number is Prime or not
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
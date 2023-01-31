import java.util.*;
class Loops {
	public static void main(String[] args) {
		// for loop
		for(int counter = 0; counter < 100; counter = counter + 1) {
			System.out.println("Hello World");
		}
		
		// counter++ => counter = counter + 1
		for(int counter = 0; counter < 11; counter++) { // printing counter 10 times
			System.out.print(counter + " ");
		}
		
		for(int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		// while loop
		int i = 0;
		while(i < 11) {
			System.out.println(i);
			i = i + 1;
		}
		
		// do-while loop
		i = 0;
		do {   
			System.out.println(i);
			i = i + 1;
		} while(i < 11); // chahe condition true hai ya false, kam se kam task ek baar jarur run hoga
		
		// comparison between while and do-while loop
		i = 12;
		while(i < 11) {
			System.out.println(i);	// will not print even one time
		}
		
		do {
			System.out.println("Apna College"); // will print one time
		} while(i < 11);
		
		// Exercise
		// Print the Sum of First n Natural Numbers.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int t=0; t<=n; t++) {
			sum = sum + t;
		}
		System.out.println(sum);
		
		// Print the table of a number input by the user.
		int num = sc.nextInt();
		for(int t=1; t<11; t++) {  // loops code reduce kar dete hai
			System.out.println(num*t);
		}
	}
}
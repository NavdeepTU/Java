import java.util.*;
class Conditions {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// if-else
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");
		}
		
		int x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		// if-else-if-else
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == b) {
			System.out.println("Equal");
		} else if(a > b){
			System.out.println("a is greater");
		} else {
			System.out.println("a is lesser");
		}
		
		int button = sc.nextInt();
		if(button == 1) {
			System.out.println("Hello");
		} else if(button == 2) {
			System.out.println("Namaste");
		} else if(button == 3){
			System.out.println("Bonjour");
		} else {
			System.out.println("Invalid button");
		}
		
		// switch (used when there are many if else statements to make code cleaner)
		switch(button) {     // button can be a number or a character
			case 1:
				System.out.println("Hello");
				break; // if this break is not present then saare cases execute ho jaaenge
			case 2:
				System.out.println("Namaste");
				break; // break code execution ko block ke bahar le jaaega
			case 3:
				System.out.println("Bonjour");
				break;
			default:
				System.out.println("Invalid button");
		}
	}
}

/*
 *  15
 *  Not Adult
 *
 *  21
 *  Adult
 */
import java.util.*;

class Strings {
	public static void main (String[] args) {
		// String Declaration
		String name = "Tony";
		String fullName = "Tony Stark";
		String sentence = "My name is Tony Stark.";
		
		// Input string from user
		Scanner sc = new Scanner(System.in);
		// String nm = sc.nextLine();
		// System.out.println("Your name is " + nm);
		
		// String functions
		// concatenation
		String firstName = "tony";
		String lastName = "stark";
		String fullNamee = firstName + "@" + lastName;
		System.out.println(fullNamee);
		
		// length
		System.out.println(fullNamee.length());
		
		// charAt -> to print characters in a string
		for(int i=0; i<fullNamee.length(); i++) {
			System.out.println(fullNamee.charAt(i));
		}
		
		// compareTo
		String name1 = "tony";
		String name2 = "tony";
		
		//1 s1 > s2 : +ve value
		//2 s1 == s2 : 0
		//3 s1 < s2 : -ve value
		
		// hello < wello
		// hello > cello
		// aahello > aabello
		
		if(name1.compareTo(name2) == 0) { // will compare case also
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		if(name1 == name2) {  // will some times return false because they compare objects (not recommended)
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		// substring
		String sentenceNew = "My name is Tony";
		// substring(beg index, end index) end index is exclusive
		String nameNew = sentenceNew.substring(11); // end index zaruri nhi hai agar last tak jana hai
		System.out.println(nameNew);
		
		// Strings are Immutable
	}
}
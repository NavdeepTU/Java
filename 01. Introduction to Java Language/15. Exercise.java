import java.util.*;

class StringsExercise {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take an array of Strings input from the user and find the cumulative (combined)
		// length of all those strings.
		
		System.out.print("How many strings you want to enter ? ");
		int n = sc.nextInt();
		String[] stringArray = new String[n];
		System.out.println("Now enter the strings");
		int cummulativeSum = 0;
		for(int i=0; i<n; i++) {
			stringArray[i] = sc.next();
			int len = stringArray[i].length();
			cummulativeSum += len;
		}
		System.out.println("Combined length " + cummulativeSum);
		
		// Input a string from the user. Create a new string called ‘result’ in which you will replace the 
		// letter ‘e’ in the original string with letter ‘i’. 
		// Example : 
		// original = “eabcdef’ ; result = “iabcdif”
		// Original = “xyz” ; result = “xyz”
		
		System.out.print("Enter input string ");
		String original = sc.next();
		String result = "";
		for(int i=0; i<original.length(); i++) {
			if(original.charAt(i) == 'e')
				result = result + "i";
			else
				result = result + original.charAt(i);
		}
		System.out.println(result);
		
		// Input an email from the user. You have to create a username from the email by deleting 
		// the part that comes after ‘@’. Display that username to the user.
		// Example : 
		// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
		// email = “helloWorld123@gmail.com”; username = “helloWorld123”
		
		System.out.print("Enter the email ");
		String email = sc.next();
		String username;
		int index = 0;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i) == '@') {
				index = i;
				break;
			}
		}
		username = email.substring(0, index);
		System.out.println("Your username is : " + username);
	}
}
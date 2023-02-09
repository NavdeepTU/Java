import java.util.*;

class ExerciseStringBuilder {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take an array of Strings input from the user and find the cumulative (combined)
		// length of all those strings.
		System.out.print("How many strings you want to enter ? ");
		int n = sc.nextInt();
		StringBuilder[] sbArray = new StringBuilder[n];
		System.out.println("Enter the strings");
		int sum = 0;
		for(int i=0; i<n; i++) {
			String s = sc.next();
			sbArray[i] = new StringBuilder(s);
			sum += sbArray[i].length();
		}
		System.out.println(sum);
		
		// Input a string from the user. Create a new string called ‘result’ in which you will replace the 
		// letter ‘e’ in the original string with letter ‘i’. 
		// Example : 
		// original = “eabcdef’ ; result = “iabcdif”
		// Original = “xyz” ; result = “xyz”
		StringBuilder sb = new StringBuilder(sc.next());
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == 'e'){
				sb.setCharAt(i, 'i');
			}
		}
		System.out.println(sb);
		
		// Input an email from the user. You have to create a username from the email by deleting 
		// the part that comes after ‘@’. Display that username to the user.
		// Example : 
		// email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
		// email = “helloWorld123@gmail.com”; username = “helloWorld123”
		sb = new StringBuilder(sc.next());
		int idx = -1;
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == '@') {
				idx = i;
				break;
			}
		}
		sb.delete(idx, sb.length());
		System.out.println(sb);
	}
}
import java.util.*;

class RecursionLevel2 {
	
	// Print a string in reverse
	public static void printRev(String s, int idx) {
		
		if(idx == s.length())
			return;
		
		printRev(s, idx+1);
		System.out.print(s.charAt(idx));
	}
	
	// Find first and last occurence of element
	public static void printFirstAndLastOcurr(String s, int idx, char c, int first, int last) {
		
		// base condition
		if(idx == s.length()) {
			System.out.println("First Occurence " + first);
			System.out.println("Last Occurence " + last);
			return;
		}
		
		if(s.charAt(idx) == c) {
			if(first == -1)
				first = idx;
			last = idx;
		}
		printFirstAndLastOcurr(s, idx+1, c, first, last);
	}
	
	// Check if an array is sorted (Strictly Increasing)
	public static void isSorted(int[] arr, int idx) {
		
		if(idx == arr.length) {
			System.out.println("The array is sorted");
			return;
		}
		
		if(arr[idx-1] >= arr[idx]) {
			System.out.println("The array is not sorted");
			return;
		}
		isSorted(arr, idx+1);
	}
	
	// Move all 'x' to the end of the string
	public static void moveXtoEnd(char[] ch, int first, int last) {
		
		// base condition
		if(first >= last) {
			String result = new String(ch);
			System.out.println(result);
			return;
		}
		
		if(ch[first] == 'x') {
			char t = ch[last];
			ch[last] = ch[first];
			ch[first] = t;
			last--;
		} else {
			first++;
		}
		moveXtoEnd(ch, first, last);
	}
	
	public static void main (String[] args) {
		String s = "axbcxxd";
		char c = 'a';
		int[] arr = {1, 2, 3, 4, 5, 3};
		//printRev(s, 0);
		//printFirstAndLastOcurr(s, 0, c, -1, -1);
		//isSorted(arr, 1);
		moveXtoEnd(s.toCharArray(), 0, s.length()-1);
	}
}
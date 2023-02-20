import java.util.*;

class RecursionLevel3 {
	
	// Print all permutations of a string (Time complexity -> O(n!))
	public static void printPermutation(String s, int idx) {
		
		// base condition
		if(idx == s.length()) {
			System.out.println(s);
			return;
		}
		
		char[] ch = s.toCharArray();
		for(int i=idx; i<s.length(); i++) {
			// swap char present at idx(current index) with char present at index i
			char t = ch[idx];
			ch[idx] = ch[i];
			ch[i] = t;
			String newString = new String(ch);
			printPermutation(newString, idx+1);
			// restore the array
			t = ch[idx];
			ch[idx] = ch[i];
			ch[i] = t;
		}
	}
	
	public static void main (String[] args) {
		String s = "abc";
		printPermutation(s, 0);
	}
}
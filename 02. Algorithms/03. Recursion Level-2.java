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
	
	// Remove duplicates in a string
	public static void removeDuplicates(StringBuilder sb, int idx, int[] arr) {
		
		if(idx == sb.length()) {
			System.out.println(sb);
			return;
		}
		
		int arrIdx = sb.charAt(idx) - 'a';
		if(arr[arrIdx] != 0)
			sb.delete(idx, idx+1);
		else {
			arr[arrIdx] = 1;
			idx += 1;
		}
		removeDuplicates(sb, idx, arr);
		
	}
	
	// Print all the subsequences of a string (Important)
	public static void printSubsequence(String s, int idx, String subseq) {
		
		if(idx == s.length()) {
			System.out.println(subseq);
			return;
		}
		
		String includeI = subseq + s.substring(idx, idx+1);
		printSubsequence(s, idx+1, includeI);
		printSubsequence(s, idx+1, subseq);
	}
	
	// Print all unique subsequences of a string
	public static void printUniqueSubsequences(String s, int idx, String subseq, HashSet<String> set) {
		
		if(idx == s.length()) {
			if(set.contains(subseq)) {
				return;
			} else {
				System.out.println(subseq);
				set.add(subseq);
				return;
			}
		}
		
		String includeI = subseq + s.substring(idx, idx+1);
		printUniqueSubsequences(s, idx+1, includeI, set);
		printUniqueSubsequences(s, idx+1, subseq, set);
	}
	
	// Print keypad combination
	public static void printKeypadCombination(String s, int idx, HashMap<Character, String> hm, String currCombination) {
		
		// base condition
		if(idx == s.length()) {
			System.out.println(currCombination);
			return;
		}
		
		char c = s.charAt(idx);
		String charMap = hm.get(c);
		for(int i=0; i<charMap.length(); i++) {
			String temp = currCombination;
			currCombination += charMap.substring(i, i+1);
			printKeypadCombination(s, idx+1, hm, currCombination);
			currCombination = temp;
		}
	}
	
	public static void main (String[] args) {
		String s = "23";
		char c = 'a';
		int[] arr = {1, 2, 3, 4, 5, 3};
		//printRev(s, 0);
		//printFirstAndLastOcurr(s, 0, c, -1, -1);
		//isSorted(arr, 1);
		//moveXtoEnd(s.toCharArray(), 0, s.length()-1);
		//StringBuilder sb = new StringBuilder(s);
		//int[] ar = new int[sb.length()];
		//removeDuplicates(sb, 0, ar);
		//printSubsequence(s, 0, "");
		//HashSet<String> set = new HashSet<String>();
		//printUniqueSubsequences(s, 0, "", set);
		HashMap<Character, String> hm = new HashMap<Character, String>();
		hm.put('0', ".");
		hm.put('1', "abc");
		hm.put('2', "def");
		hm.put('3', "ghi");
		hm.put('4', "jkl");
		hm.put('5', "mno");
		hm.put('6', "pqrs");
		hm.put('7', "tu");
		hm.put('8', "vwx");
		hm.put('9', "yz");
		printKeypadCombination(s, 0, hm, "");
	}
}
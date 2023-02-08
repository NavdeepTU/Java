import java.util.*;

// String builder is used when we need to perform lot of insert and delete operations of strings
// variable is stack memory will refer to the same object in heap memory

class Strings {
	public static void main (String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		// character at index 0
		System.out.println(sb.charAt(0)); // T
		
		// set char at index 0
		sb.setCharAt(0, 'P'); // cannot modify a single char in simple String 
		System.out.println(sb); // Pony
		
		// insert
		sb.insert(0, 'S'); // simple String mai ye operation nhi perform kar skte
		System.out.println(sb); // SPony
		
		sb.insert(3, 'n');
		System.out.println(sb); // SPonny
		
		// delete the extra 'n'
		sb = new StringBuilder("Tonny");
		sb.delete(2, 4); // end index exclusive
		System.out.println(sb); // Toy
		
		// appending
		sb = new StringBuilder("h");
		sb.append("e"); // str = str + "e";
		sb.append("l"); // str = str + "l";
		sb.append("l");
		sb.append("o");
		System.out.println(sb);  // hello
		
		// length()
		System.out.println(sb.length()); // 5
		
		// reverse a string
		sb = new StringBuilder("hello");
		
		for(int i=0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length() - 1 - i;
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		
		System.out.println(sb); // olleh
	}
}
import java.util.Stack;

// this implementation is recommended for interviews and compettitive coding

class StackClass {
	public static void main (String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		// 4
		// 3
		// 2
		// 1
		
		// Now you need to use these existing Collections framework and apply mind on algorithms
	}
}
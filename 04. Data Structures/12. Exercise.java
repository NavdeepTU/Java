import java.util.Stack;

class StackExercise {
	
	// Insert at bottom of the stack
	public static void insertBottom(Stack<Integer> s, int val) {
		if(s.isEmpty()) {
			s.push(val);
			return;
		}
		
		int top = s.pop();
		insertBottom(s, val);
		s.push(top);
	}
	
	// Reverse a Stack
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverse(s);
		insertBottom(s, top);
	}
	
	public static void main (String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		//insertBottom(s, 4);
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
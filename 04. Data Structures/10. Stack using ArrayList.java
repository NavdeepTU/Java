import java.util.ArrayList;

class Stack {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public boolean isEmpty() {
		return list.size() == 0;
	}
	
	// push
	public void push(int data) {
		list.add(data);
	}
	
	// pop
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		
		int top = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return top;
	}
	
	// peek
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		
		return list.get(list.size() - 1);
	}
}

class StackClass {
	public static void main (String[] args) {
		Stack s = new Stack();
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
	}
}
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

class QueueY {
	public static void main (String[] args) {
		//Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
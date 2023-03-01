import java.util.*;

class LLUsingCollections {
	public static void main (String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list); // [is, a]
		
		list.addFirst("this");
		list.addLast("list"); // list.add("list"); -> this also adds the element at the last
		System.out.println(list); // [this, is, a, list]
		
		System.out.println(list.size()); // 4
		
		// iterating the list
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("null");
		
		list.removeFirst();
		System.out.println(list); // [is, a, list]
		
		list.removeLast();
		System.out.println(list); // [is, a]
		
		list.remove(1); // removing by specifying index
		System.out.println(list); // [is]

	}
}
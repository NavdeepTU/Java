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
	
	// Count total paths in a maze to move from (0,0) to (n,m). 
	// You can either move rightwards or downwards.
	public static int countPaths(int n, int m) {
		
		if(n == 0 && m == 0)
			return 1;
		if(n < 0 || m < 0)
			return 0;
		
		int rightPaths = countPaths(n, m-1);
		int downPaths = countPaths(n-1, m);
		return rightPaths + downPaths;
	} // -> Time complexity very high 
	
	// Place Tiles of size 1*m in a floor of size n*m
	public static int placeTiles(int n, int m) {
		
		// base cases
		if(n == m)
			return 2;  // 1 horizontal + 1 vertical
		if(n < m)
			return 1;  // can only place horizontally
		
		// if tile positioned horizontal
		int horizontalWays = placeTiles(n-1, m);
		
		// if tile positioned vertical
		int verticalWays = placeTiles(n-m, m);
		
		return horizontalWays + verticalWays;
	}
	
	// Find the number of ways
	public static int countWays(int n) {
		
		// base conditions
		if(n == 0)
			return 0;
		if(n == 1 || n == 2)
			return n;
		
		// when current guest invited alone
		int single = countWays(n-1);
		// when invited in pair
		int pair = (n-1)*countWays(n-2);
		
		return single+pair;
	}
	
	// Print all the subsets of a set of first n natural numbers -> Time complexity -> O(2^n)
	public static void findSubsets(int n, ArrayList<Integer> subset) {
		
		if(n == 0) {
			printSubsets(subset);
			return;
		}
		
		// add hoga
		subset.add(n);
		findSubsets(n-1, subset);
		
		// add nhi hoga
		subset.remove(subset.size() - 1);
		findSubsets(n-1, subset);
	}
	
	public static void printSubsets(ArrayList<Integer> subset) {
		for(int i=0; i<subset.size(); i++) {
			System.out.print(subset.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		String s = "abc";
		//printPermutation(s, 0);
		int n = 3, m = 2;
		//System.out.println(countPaths(n, m));
		//System.out.println(placeTiles(n, m));
		//System.out.println(countWays(n));
		ArrayList<Integer> subset = new ArrayList<Integer>();
		findSubsets(n, subset);
	}
}
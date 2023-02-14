import java.util.*;

class Sorting {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] arr = {7, 8, 3, 1, 2};
		
		// time complexity = O(n^2)
		// bubble sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
		
		// time complexity = O(n^2)
		// selection sort
		int[] arr2 = {7, 8, 3, 1, 2};
		for(int i=0; i<arr2.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr2.length; j++) {
				if(arr2[j] < arr2[smallest]) {
					smallest = j;
				}
			}
			int temp = arr2[smallest];
			arr2[smallest] = arr2[i];
			arr2[i] = temp;
		}
		printArray(arr2);
		
		// time complexity = O(n^2)
		// insertion sort
		int[] arr3 = {7, 8, 3, 1, 2};
		for(int i=1; i<arr3.length; i++) {
			int current = arr3[i];
			int j = i-1;
			while(j >= 0 && current < arr3[j]) {
				arr3[j+1] = arr3[j];
				j--;
			}
			
			// placement
			arr3[j+1] = current;
		}
		printArray(arr3);
	}
}
class QuickSort {
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // selecting last element as the pivot element
		int i = low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				// swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		// placing pivot element at its correct place
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pvtIdx = partition(arr, low, high);
			quickSort(arr, low, pvtIdx-1);
			quickSort(arr, pvtIdx, high);
		}
	}
	
	public static void main (String[] args) {
		int[] arr = {3, 6, 8, 5, 2, 9};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		
		// printing sorted array
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


/* Time complexity of Quicksort is average case is O(nlgn).
 * In worst case its time complexity is O(n^2), when the complete array is sorted and each time the pivot element is the largest element.
 * Space complexity is O(1)
 *
 *
 *	The time complexity of quick sort can be reduced to O(nlgn) even in worst case by selecting pivot element randomly.
 */
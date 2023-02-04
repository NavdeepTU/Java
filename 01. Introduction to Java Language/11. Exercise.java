import java.util.*;
class ArraysExercise {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take an array of names as input from the user and print them on the screen
		System.out.print("How many names you want to enter ? ");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter the names ");
		for(int i=0; i<names.length; i++) {
			names[i] = sc.next();
		}
		System.out.println("Names you entered are : ");
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
			
		// Find the maximum and minimum number in an array of integers
		int[] numbers = {23, 56, 78, 11, 63, 98, 49, 90};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < min)
				min = numbers[i];
			if(numbers[i] > max)
				max = numbers[i];
		}
		
		System.out.println("Min value is " + min);
		System.out.println("Max valur is " + max);
		
		// Take an array of numbers as input and check if it is an array sorted in ascending order.
		System.out.print("How many numbers you want to enter ? ");
		int s = sc.nextInt();
		int[] nums = new int[s];
		System.out.println("Enter the numbers");
		for(int i=0; i<nums.length; i++)
			nums[i] = sc.nextInt();
		boolean isSorted = true;
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1] > nums[i]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
    }
}
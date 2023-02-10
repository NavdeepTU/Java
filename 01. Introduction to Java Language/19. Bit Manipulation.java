/* Bit Manipulation is a very useful technique to reduce the time and space complexity of algorithms by 
 * large amount.
 *
 * Get Bit
 * Get the 3rd bit (position = 2) of a number n. (n = 0101)
 * Algo :
 * BitMask : 1 << i(2)
 * Operation : if n & BitMask > 0 then ith bit is 1 else 0
 *
 * Set Bit
 * Set the 2nd bit (position = 1) of a number n. (n = 0101)
 * Algo :
 * BitMask : 1 << i(1)
 * Operation : n | BitMask
 *
 * Clear Bit
 * Clear the 3rd bit(position = 2) of a number n. (n = 0101)
 * Algo :
 * BitMask : 1 << i(2)
 * Operation : n & ~(BitMask)
 *
 * Update Bit -> Same as Set Bit and Clear Bit operations
 * if we want to update 0 to 1 then use set bit operation
 * if we want to update 1 to 0 then use clear bit operation
 *
 */

import java.util.*;
 
class Bits {
 	public static void main (String[] args) {
		int n = 5;
		int pos = 3;
		
		// Get bit
		int bitMask = 1 << pos;
		
		if((bitMask & n) == 0) {
			System.out.println("bit was zero"); // bit was zero
		} else {
			System.out.println("bit was one");
		}
		
		// Set bit
		n = 5;
		pos = 1;
		bitMask = 1 << pos;
		int newNumber = bitMask | n;
		System.out.println(newNumber); // 7
		
		// Clear Bit
		n = 5;
		pos = 2;
		bitMask = 1 << pos;
		int notBitMask = ~bitMask;
		newNumber = notBitMask & n;
		System.out.println(newNumber); // 1
		
		// Update Bit
		Scanner sc = new Scanner(System.in);
		n = 5;
		pos = 1;
		int oper = sc.nextInt(); // if oper = 1 : set if oper = 0 : clear
		bitMask = 1 << pos;
		
		if(oper == 1) {
			// set
			newNumber = bitMask | n;
			System.out.println(newNumber);
		} else {
			// clear
			notBitMask = ~bitMask;
			newNumber = notBitMask & n;
			System.out.println(newNumber);
		}
	}
 }
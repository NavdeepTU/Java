import java.util.*;

class BitManipulationExercise {
	
	// function to convert decimal to binary
	public static String decimalToBinary(int n) {
		String binaryRepresentation = "";
		while(n != 0) {
			int binary = n%2;
			if(binary == 1)
				binaryRepresentation = "1" + binaryRepresentation;
			else
				binaryRepresentation = "0" + binaryRepresentation;
			n /= 2;
		}
		return binaryRepresentation;
	}
	
	// function to convert binary to decimal
	public static int binaryToDecimal(String binaryRep) {
		int decimalValue = 0;
		int powerOfTwo = 1;
		for(int i = binaryRep.length()-1; i>=0; i--) {
			if(binaryRep.charAt(i) == '1') {
				if(i == binaryRep.length()-1)
					decimalValue += 1;
				else
					decimalValue += powerOfTwo;
			}
			powerOfTwo *= 2;
		}
		return decimalValue;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Write a program to find if a number is a power of 2 or not.
		int n = sc.nextInt();
		int setBits = 0;
		int bitCount = (int)(Math.log(n) / Math.log(2)) + 1; // computing number of bits reqired to represent n (log(n) base 2 + 1)
		int bitMask;
		boolean powerOfTwo = false;
		if((n & 1) == 0) { // if number is not odd
			for(int i=1; i<=bitCount; i++) {
				bitMask = 1 << i;
				if((n & bitMask) != 0) 
					setBits += 1;
			}
			if(setBits == 1)
				powerOfTwo = true;
		}
		if(powerOfTwo)
			System.out.println("Number is power of two");
		else
			System.out.println("Number is not power of two");
		
		// Write a program to toggle a bit a position = "pos" in a number "n".
		n = sc.nextInt();
		int pos = sc.nextInt();
		if(((1 << pos) & n) != 0) { // bit is set, clear it
			bitMask = 1 << pos;
			bitMask = ~bitMask;
			n = n & bitMask;
		} else { // bit is clear, set it
			bitMask = 1 << pos;
			n = n | bitMask;
		}
		System.out.println("After toggle the number is " + n);
		
		// Write a program to count the number of 1's in a binary representation of a number.
		n = sc.nextInt();
		int setBitsCount = 0;
		while(n != 0) {
			setBitsCount += n%2;
			n = n/2;
		}
		System.out.println("Set bits are " + setBitsCount);
		
		// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert
		// a number from one number system to another.
		n = 9;
		String binaryRep = decimalToBinary(n);
		System.out.println("Binary representation of " + n + " is " + binaryRep);
		binaryRep = "10101";
		System.out.println("Decimal representation of " + binaryRep + " is " + binaryToDecimal(binaryRep));
	}
}
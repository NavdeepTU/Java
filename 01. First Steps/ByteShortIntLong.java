// In java primitive types are the most basic data types.
// The eight primitive data types in Java are boolean, byte, char, short, int, long, float and double.
// Consider these types as the building blocks of data manipulation.
class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;
        // determing the range
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // concatination
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Java uses the concept of a Wrapper class for all eight primitive types -
        // In the case of am int, we can use Integer, and by doing that it gives
        // us ways to perform operations on an int.
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // underflow

        int myMaxIntTest = 2_147_483_647;

    }
}

/*
Integer Minimum Value = -2147483648
Integer Maximum Value = 2147483647
Busted MAX value = -2147483648
Busted MIN value = 2147483647
 */

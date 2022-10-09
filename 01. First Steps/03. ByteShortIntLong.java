// In java primitive types are the most basic data types.
// The eight primitive data types in Java are boolean, byte, char, short, int, long, float and double.
// Consider these types as the building blocks of data manipulation.
class ByteShortIntLong03 {
    public static void main(String[] args) {
        // Each primitive type occupies a different amount of memory

        // int
        // An Integer occupies 32 bits. We say that a int has a width of 32.
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
        
        /*
            Integer Minimum Value = -2147483648
            Integer Maximum Value = 2147483647
            Busted MAX value = -2147483648
            Busted MIN value = 2147483647
         */

        int myMaxIntTest = 2_147_483_647;

        // byte
        // A Byte occupies 8 bits, and has width of 8.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); // concatination
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        
        /*
            Byte Minimum Value = -128
            Byte Maximum Value = 127
         */
        
        // short
        // A Short occupies 16 bits, and has a width of 16.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); // concatination
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        /*
            Short Minimum Value = -32768
            Short Maximum Value = 32767
         */
        
        // long
        // A Long occupies 64 bits(double the size of integer), and has a width of 64.
        long myLongValue = 100L; // the letter l or L at the end forces java to treat the number as long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); // concatination
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_243L; // if the value you are storing in long is bigger than the max value of Integer then you need to specify L in the end
        System.out.println(bigLongLiteralValue);

        /*
            Long Minimum Value = -9223372036854775808
            Long Maximum Value = 9223372036854775807
         */

        // Casting
        // Casting means to treat or convert a number from one type to another.
        // We put the type we want the number to be in parenthesis.

        int myTotal = (myMinIntValue / 2);

        // if you dont specify type that you actually want to convert to then int is assumed automatically by java.
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}

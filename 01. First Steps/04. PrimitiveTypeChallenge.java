class PrimitiveTypeChallenge04 {
    public static void main(String[] args) {
        // Your challenge is to create a byte variable and set it to any valid byte number,
        // it doesn't matter. Create a short variable and set it to any valid short number.

        // Create an int variable and set it to any valid int number. Lastly, create a variable
        // of type long and make it equal to 50000 plus 10 times the sum of the byte plus the
        // short plus the integer values.

        byte myByteValue = 40;
        short myShortValue = 500;
        int myIntValue = 4000;

        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("My long value : "+myLongValue);

        // int is the best data type to use for whole numbers
    }
}

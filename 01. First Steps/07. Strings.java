class Strings {
    public static void main(String[] args) {
        // byte - rarely used
        // short - rarely used
        // int - commonly used
        // long - less commonly used
        // float - rarely used
        // double - commonly used
        // char - less commonly used
        // boolean - commonly used

        // The String is a datatype in Java, which is not a primitive type. It's actually a Class, but
        // it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

        // String is a sequence of characters. A large number of characters. Technically it's limited
        // by memory or the MAX_VALUE of an int which was 2.14 Billion. That's a lot of characters.

        String myString = "This is a string";
        System.out.println("mystring is equal to : "+ myString);
        /*
            mystring is equal to : This is a string
         */
        // we can also concatenate two or more strings
        myString = myString + " this is more.";
        System.out.println("mystring is equal to : "+ myString);
        /*
            mystring is equal to : This is a string this is more.
         */
        // can concatenate unicode characters
        myString = myString + " \u00A9 2019";
        System.out.println("mystring is equal to : "+ myString);
        /*
            mystring is equal to : This is a string this is more. © 2019
         */
        String numberString = "250.55";
        numberString = numberString + "49.95"; // will be treated as a textual data
        System.out.println(numberString);
        /*
            250.5549.95
         */
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // java converts myInt to string and appends it to 10
        System.out.println("LastString is equal to : "+lastString);
        /*
            LastString is equal to : 1050
         */
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber; // same here also
        System.out.println("LastString is equal to : "+lastString);
        /*
            LastString is equal to : 1050120.47
         */
        // In latter lessons, we will see some advance features of Strings.

        // Strings in java are immutable.
        // In line number 49 a new string is created by Java and assigned to lastString
        // and the old one got discarded.

        // Appending values like this is inefficient and not recommended. We'll see a better way
        // of doing it in a future video where we discuss something called as StringBuffer which
        // can be changed.
    }
}

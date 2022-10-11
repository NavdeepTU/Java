class CharAndBoolean {
    public static void main(String[] args) {
        // char
        // occupies 16 bits(2 bytes). The reason it's not just a single byte is that it allows you to store
        // Unicode characters.

        // Unicode is an international encoding standard for use with different languages and scripts,
        // by which each letter, digit, or symbol is assigned a unique numeric value that applies
        // accross different platforms and programs.

        // In the English alphabet, we have the letters A through Z. Meaning only 26 characters are
        // needed in total to represent the entire English alphabet. But other languages need more characers,
        // and often a lot more.

        // Unicode allows us to represent these languages and the way it works is that by using a combination
        // of the 'two bytes' that a char takes up in memory it can represent any one of 65535 different
        // types of characters.

        // char is different from string
        char myChar = 'D'; // can store only one character
        // unicode-table.com
        char myUnidodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnidodeChar);
        /*
            D
            D
         */
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        /*
            ©
         */

        // boolean
        // A boolean value allows for two choices True or False.
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomeOverTwentyOne = true;
    }
}

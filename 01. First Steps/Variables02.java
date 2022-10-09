class Variables02 {
    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10); // dataType variableName assigned_value(optional)
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber; // an expression

        System.out.println(myTotal);
        /*
            117
         */

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
        /*
            883
         */
    }
}

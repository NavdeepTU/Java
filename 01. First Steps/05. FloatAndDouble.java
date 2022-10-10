class FloatAndDouble {
    // Unlike whole numbers, floating point numbers have fractional point numbers that 
    // we express with a decimal point. eg: 3.14
    // Floating point numbers are also known as real numbers. We use a floating point number
    // when we need more precision in calculations.
    // Float is a single precision number ( occupies 32 bits )
    // Double is a double precision number ( occupies 64 bits)
    public static void main(String[] args) {

        // float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value : " + myMinFloatValue);
        System.out.println("Float maximum value : "  + myMaxFloatValue);

        // double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value : " + myMinDoubleValue);
        System.out.println("Double maximum value : "  + myMaxDoubleValue);

        /*
            Float minimum value : 1.4E-45
            Float maximum value : 3.4028235E38
            Double minimum value : 4.9E-324
            Double maximum value : 1.7976931348623157E308
         */

        int myIntValue = 5;
        float myFloatValue = 5f; // (float) 5.25; can also be used
        double myDoubleValue = 5d;
        // by default a floating point number is assumed to be double in java
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);
        /*
            MyIntValue= 5
            MyFloatValue= 5.0
            MyDoubleValue= 5.0
         */

        // Division
        myIntValue = 5 / 2;
        myFloatValue = 5f / 2f; // (float) 5.25; can also be used
        myDoubleValue = 5d / 2d;
        System.out.println("MyIntValue= "+myIntValue); // does not handle the remainder
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);
        /*
            MyIntValue= 2
            MyFloatValue= 2.5
            MyDoubleValue= 2.5
         */

        myIntValue = 5 / 3;
        myFloatValue = 5f / 3f; // (float) 5.25; can also be used
        myDoubleValue = 5d / 3d; // 5.00 / 3.00 will also work
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue); // more precise
        /*
            MyIntValue= 1
            MyFloatValue= 1.6666666
            MyDoubleValue= 1.6666666666666667
         */
        // double is more faster than float at chip level

        // Challenge
        // Convert a given number of pounds to kilograms, 1 pound = 0.45359237 kg
        double pounds = 23;
        double kilograms = pounds * 0.45359237;
        System.out.println("Kg: "+kilograms);
        /*
            Kg: 10.43262451
         */

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        /*
            3.1415927
            3000000.456789
         */

        // In general float and double are great for general floating point operations.But
        // both are not great where precise calculations are required. Java has a class called
        // BigDecimal that overcomes this.
    }
}

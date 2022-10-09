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
        float myFloatValue = 5.25f; // (float) 5.25; can also be used
        double myDoubleValue = 5.25d;
        // by default a floating point number is assumed to be double in java
    }
}

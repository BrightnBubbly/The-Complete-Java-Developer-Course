package com.company;

public class Main {

    public static void main(String[] args) {
	// Double datatype has twice as much space as a float

        int myIntValue = 5;

        // floats have 7 decimal digits of precision
        // width of 32 (4 bytes)
        float myFloatValue = 5.25f; // can also write "(float) 5.25;"

        // Java assumes numbers with decimals are doubles
        // doubles are faster on modern computers than are floats AND they are more precise
        // doubles have 16 decimal digits of precision
        // width of 64 (8 bytes)
        double myDoubleValue = 5.89d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double myLbs = 145d;
        double myKgs = myLbs * 0.45359237d;

        System.out.println(myKgs);
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myValue = 10000;
        int intMinValue = -2_147_483_648; //You can put in underscores where you would have commas, starting with Java 7
        int intMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte myByteValue = 10;
        byte byteMinValue = -128;
        byte byteMaxValue = 127; //If you have a lot of calculations, you can use a byte (if your number is small enough), because it is faster to compute because you don't use as much memory

        // short has a width of 16
        short shortMinValue = -32_768;
        short shortMaxValue = 32_767;

        // long has a width of 64
        // put an "L" at the end of a long
        long myLongVaue = 100L;
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;

        // java automatically assumes numbers are ints
        // to do math with bytes or shorts, we have to specify our numbers are bytes or shorts (Casting)
        byte byteMath = (byte) (byteMinValue/2);
        short shortMath = (short) (shortMinValue/-2);

        // A task! Create a byte, a short and an int and then make a long that is equal to 50,000 + 10 times the sum of
        // the byte pus the short plus the int

        byte myByte = 12;
        short myShort = 3_276;
        int myInt = 214_000_000;

        // we don't have to cast the numbers to put them in a long
        long myLong = 50_000 + 10 * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}

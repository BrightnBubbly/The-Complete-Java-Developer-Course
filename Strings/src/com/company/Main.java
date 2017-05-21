package com.company;

public class Main {

    public static void main(String[] args) {
	    // String is not actually a "data type", it is a Class
        // byte, short, int, long, float, double, char and boolean are primitive data types

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);
        myString = myString + " \u00A9 2017";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); // 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString); // 1050
    }
}

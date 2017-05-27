package com.company;

public class Main {

    public static void main(String[] args) {
        // java has 53 reserved words (boolean, int, public, class, static, void, false, true, null,...)
        // https://en.wikipedia.org/wiki/List_of_Java_keywords

        // expressions are building blocks of all Java programs
        // expressions are built with variables, values and operators
        // expressions can also be built with method calls

        // a mile is equal to 1.609344 km
        double kilometers = 100 * 1.609344;

        int highscore = 50; // highscore = 50 is an expression (not the int or ;)
        if (highscore == 50) { // highscore = 50 is an expression
            System.out.println("This is an expression"); // "This is an expression" is an expression
        }
    }
}

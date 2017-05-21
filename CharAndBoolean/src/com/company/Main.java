package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        // char stores one letter or character (symbol, number);
        // width is 16 (2 bytes)

        char myUnicodeCharater = '\u00A9'; // copyright symbol
        System.out.println(myUnicodeCharater);

        boolean myBoolean = true; // can also be "false"

        char newUnicodeCharater = '\u00AE'; // registered symbol
        System.out.println(newUnicodeCharater);

    }
}

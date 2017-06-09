package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        // a statement is an entire line
        // myVariable = 50 is an expression
        // int myVariable = 50; is a statement
        // this statement assigns a value, but a statement does not *have* to
        // assign a value
        myVariable++;
        myVariable--;
        // both of those are statements
        System.out.println("This is" +
        "another" +
        " still more.");
        // a "line" ends with a semicolon, so all of the above is one statement
        // because the semicolon is not until the third "line"
        int anotherVariable = 50; myVariable--;System.out.println("This is another one");
        // above is 3 statements on one line

        // Java doesn't really care about whitespace, it is more to make your code
        // easier for humans to read

        if(myVariable == 50) {
            System.out.println("Printed");
        }
    }
}

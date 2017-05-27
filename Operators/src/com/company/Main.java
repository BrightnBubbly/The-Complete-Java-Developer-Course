package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    // operators are = and + in the above
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " / 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);

        result++;
        System.out.println("result is now " + result);

        result--;
        System.out.println("result is now " + result);

        result += 2;
        System.out.println("result is now " + result);

        result *= 10;
        System.out.println("result is now " + result);

        result -= 10;
        System.out.println("result is now " + result);

        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false; // single is "set the value to"
        if (isAlien == false) // double is test to see if it is
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the high score!");
        if (topScore != 100)
            System.out.println("You did not get the high score.");
        if (topScore > 100)
            System.out.println("You beat the high score!");

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("greator than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true) // this is "false = true", which is false
            System.out.println("This is not supposed to happen");

        if (isCar)
            System.out.println("This is the same thing as above");

        boolean wasCar = isCar ? true : false; // ternary "if it is true, return true, if it is false, return false"
        if (wasCar)
            System.out.println("wasCar is true");
    }
}

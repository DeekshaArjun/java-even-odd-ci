
package com.example;

public class EvenOdd {

    public static String checkEvenOdd(int number) {

        // Intentional mistake for CI pipeline testing
        if (number % 2 != 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(number + " is " + checkEvenOdd(number));
    }
}

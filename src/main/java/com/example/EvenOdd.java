
package com.example;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar app.jar <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (isEven(number)) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        } catch (NumberFormatException e) {
            System.err.println("Please provide a valid integer.");
            System.exit(1);
        }
    }
}

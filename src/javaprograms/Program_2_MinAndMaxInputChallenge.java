package javaprograms;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Program_2_MinAndMaxInputChallenge {
    public static void findMonAndMaxNumber() {
        // Scanner declaration for reading imput from concole
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // while loop
        while (true) {   // condition for endless while loop unless enter invalid input
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
                System.out.println(" Minimum number is = " + min );
                System.out.println(" Maximum number is = " + max );
                scanner.close();

        }

    public static void main(String[] args) {
        findMonAndMaxNumber();

    }

}








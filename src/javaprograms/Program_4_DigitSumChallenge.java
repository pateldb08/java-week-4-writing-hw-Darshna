package javaprograms;
/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 *  otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them;
 *  also we don't want to process  negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 *  Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that
 *  it is working  correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 *  Use n = n / 10 to discard the least-significant digit.
 *  The method needs to be static
 *  Create a class with the name DigitSumChallenge.
 */
import java.util.Scanner;
public class Program_4_DigitSumChallenge {
    public static int sumDigits(int number){
        if (number>=10){
            int digit;
            int sum = 0;
            while (number > 0) {
                digit = number % 10; // find the last digit of the given number
                sum = sum + digit;   // adds last digit to the variable sum
                number = number / 10;  // removes the last digit from the number
            }
            return sum;
        }else {        // return -1 for negative numbers and single digit number
            return -1;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number = : ");
        int result = sumDigits(scanner.nextInt());
        System.out.println("Sum of number digits is: " + result);
        // closing the scanner object
        scanner.close();
    }


}

package javaprograms;
/**
 * 3. Write a Java program that takes the user to provide a single character from the   alphabet.
 * Print Vowel of Consonant,
 *    depending on the user input.
 *    If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1,
 *    print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output: *  Input letter is Consonant
 */
import java.util.Scanner;
public class Program_3_VowelOrConsonant {
 public static void checkVowelOrConsonant(String letter) {
  // checking the length of string
  // if user enter more than 1 character an error message is printed
  if (letter.length() > 1) {
   System.out.println("Error - Not a singel character");
   // if user enter a symbol
  } else if (!(isItAletter(letter))) {
   System.out.println("Error. Not a letter. Enter upper case or lower case letter");

  } else if (letter.equals("a") || letter.equals("e") || letter.equals("i")
          || letter.equals("o") || letter.equals("u")) {
   System.out.println(" Input letter is a vowel");

  } else {
   System.out.println("Input letter is a consonant");
  }

 }
 // This method will check is it a letteror not?
 public static boolean isItAletter(String l){
  return l.charAt(0) > 96 && l.charAt(0) < 123;
 }

 public static void main(String[] args) {
  //Scanner declaration for reading input form console
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter any character: ");
  String str = scanner.next().toLowerCase();
  //calling static method directly
  checkVowelOrConsonant(str);
  // closing the scanner object
  scanner.close();

 }

}

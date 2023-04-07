package javaprograms;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * <p>
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
import java.util.Scanner;
public class Program_6_NumberTriangle {
    public static void numTriangle(int n){
        for (int i=0; i<=n; i++ ){
            for (int j=0; j<i; j++){
                System.out.println(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int n1 = scanner.nextInt();
        numTriangle(n1);    //calls static method

        // or we can do the below way directly
      //  numTriangle(scanner.nextInt());
        scanner.close();   // closing scanner object.
    }

}

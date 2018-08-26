

package javalab4_B;
import java.util.Scanner;
/**
 * @author Ivan Panamarou
 */
public class JavaLab4_B05 {
   public static void main(String[] args) {
       System.out.println("Task 5: Find the product of digits"
       + "\nof the decimal number.");
       int n;
       System.out.println("\nPlease enter number:");
       Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
       int pr = B05_DigitsProduct.digitsProduct(n);
       System.out.println("The number is " + n);
       System.out.println("The product is " + pr);
       
   }
}

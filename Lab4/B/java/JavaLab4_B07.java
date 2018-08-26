

package javalab4_B;
import java.util.Scanner;
/**
 * @author Ivan Panamarou
 */
public class JavaLab4_B07 {
   public static void main(String[] args) {
       System.out.println("Task 7: Reverse the multiplace number");
       int n;
       System.out.println("Please enter number");
       Scanner scanner = new Scanner (System.in);
       n = scanner.nextInt();
       int rev = B07_Reverse.reverse(n);
       System.out.println("Initial number: " + n);
       System.out.println("Reversed number: " + rev);
   }
}

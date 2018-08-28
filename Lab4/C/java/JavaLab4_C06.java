

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C06 {

        public static void main(String[] args) {
        System.out.println("Task 6: Find out the minimal and maximal"
            + "\nout of numbers A, B and C.");        
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A:");
        a = scanner.nextDouble();
        System.out.println("Please enter B:");
        b = scanner.nextDouble();
        System.out.println("Please enter C:");
        c = scanner.nextDouble();
        String min = C06_MinimumMaximum.findMinimum(a, b, c);
        String max = C06_MinimumMaximum.findMaximum(a, b, c);
        System.out.println("A = " + a + "\nB = " + b + "\nC = " + c);
        System.out.println("Minimal is " + min);
        System.out.println("Maximal is " + max);
    }
}

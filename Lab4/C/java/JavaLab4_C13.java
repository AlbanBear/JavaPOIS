

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C13 {

    public static void main(String[] args) {
        double a;
        System.out.println("Task 13: Convert degrees to radians and vice-versa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        a = scanner.nextDouble();
        double rad = C13_DegreesRadians.degreesToRadians(a);
        double deg = C13_DegreesRadians.radiansToDegrees(a);
        System.out.println(a + " Degrees is " + rad + " Radians.");
        System.out.println(a + " Radians is " + deg + " Degrees.");
    }
    
}

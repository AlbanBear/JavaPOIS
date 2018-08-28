

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C03 {
    public static void main(String[] args) {
        System.out.println("Task 3: Calculate the circuference and area of the circle"
                + "\nwith radius of R.");        
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius R:");
        r = scanner.nextDouble();
        double circuference = C03_CircleCalculator.calculateCircumference(r);
        double area = C03_CircleCalculator.calculateArea(r);
        System.out.println("Circumference is " + circuference);
        System.out.println("Area of the rectangle is " + area); 
    }
}

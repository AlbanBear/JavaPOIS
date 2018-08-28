

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C01 {
    public static void main(String[] args) {
        System.out.println("Task 1: Calculate the perimeter and area of the square"
                + "\nwith a side length of A.");

        Scanner scanner = new Scanner (System.in);
        System.out.println("\nPlease enter the side length:");
        double a = scanner.nextDouble();
        double perimeter = C01_SquareCalculator.calculatePerimeter(a);
        double area = C01_SquareCalculator.calculateArea(a);
        System.out.println("Perimeter of the square is " + perimeter);
        System.out.println("Area of the square is " + area);
        
    }

}

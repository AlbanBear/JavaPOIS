

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C10 {

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        System.out.println("Task 10: Find the area and perimeter of rectangle"
            + "\nspecified by opposite apices with coordinates (x1, y1) and (x2, y2)."
                + "\nSides of rectangle are parallel to coordinate axes.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the abscissa of Point1 (x1):");
        x1 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of Point1 (y1):");
        y1 = scanner.nextDouble();              
        System.out.println("Please enter the abscissa of Point2 (x2):");
        x2 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of Point2 (y2):");
        y2 = scanner.nextDouble(); 
        double perimeter = C10_RectangleByApices.calculatePerimeter(x1, y1, x2, y2);
        double area = C10_RectangleByApices.calculateArea(x1, y1, x2, y2);
        System.out.println("Perimeter of the rectangle is " + perimeter);
        System.out.println("Area of the rectangle is " + area); 
    }
}

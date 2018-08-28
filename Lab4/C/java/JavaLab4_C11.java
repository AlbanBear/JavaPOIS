

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C11 {

        public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3;
        System.out.println("Task 11: Find the area and perimeter of triangle"
            + "\nspecified by apices with coordinates (x1, y1), (x2, y2) and (x3,y3).");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the abscissa of PointA (x1):");
        x1 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of PointA (y1):");
        y1 = scanner.nextDouble();              
        System.out.println("Please enter the abscissa of PointB (x2):");
        x2 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of PointB (y2):");
        y2 = scanner.nextDouble(); 
        System.out.println("Please enter the abscissa of PointC (x3):");
        x3 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of PointC (y3):");
        y3 = scanner.nextDouble();
        double perimeter = C11_TriangleByApices.calculatePerimeter(x1, y1, x2, y2, x3, y3);
        double area = C11_TriangleByApices.calculateArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Perimeter of the rectangle is " + perimeter);
        System.out.println("Area of the rectangle is " + area);
    }
}

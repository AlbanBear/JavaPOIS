

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C09 {

    public static void main(String[] args) {
        double x1, x2, y1, y2;
        System.out.println("Task 9: Find out the distance b/t two dots"
            + "\non surface with coordinates (x1, y1) and (x2, y2)).");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the abscissa of Point1 (x1):");
        x1 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of Point1 (y1):");
        y1 = scanner.nextDouble();              
        System.out.println("Please enter the abscissa of Point2 (x2):");
        x2 = scanner.nextDouble();
        System.out.println("Please enter the ordinate of Point2 (y2):");
        y2 = scanner.nextDouble();        
        double distance = C09_DistanceBtPoints.DistanceBtPoints(x1, y1, x2, y2);
        System.out.println("Distance b/t points is " + distance);
    }
}

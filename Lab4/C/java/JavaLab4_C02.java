

package javalab4_C;
import java.util.Scanner;
/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C02 {

    public static void main(String[] args) {
        System.out.println("Task 2: Calculate the perimeter and area of the rectagle"
               + "\nwith side lengtha of A and B.");        
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side length A:");
        a = scanner.nextDouble();
        System.out.println("Please enter side length B:");
        b = scanner.nextDouble();
        double perimeter = C02_RectangleCalculator.calculatePerimeter(a,b);
        double area = C02_RectangleCalculator.calculateArea(a,b);
        System.out.println("Perimeter of the rectangle is " + perimeter);
        System.out.println("Area of the rectangle is " + area);        
        
        }
}

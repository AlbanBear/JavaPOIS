

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C08 {
    public static void main(String[] args) {
        System.out.println("Task 8: There are two concentered circles with radii"
            + "\nof R1 and R2 (R1 > R2)."
                + "\nFind the area of the ring with outer radius of R1 and inner"
                + "\nradius of R2.");        
        double r1, r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius R1:");
        r1 = scanner.nextDouble();
        System.out.println("Please enter the radius R2:");
        r2 = scanner.nextDouble();
        double area = C08_RingCalculator.calculateRingArea(r1, r2);
        System.out.println("Area of the ring is " + area);
         
    }
 
}

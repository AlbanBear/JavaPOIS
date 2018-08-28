

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C19 {
    public static void main(String[] args) {
        System.out.println("Task 19: Calculate the distance between two cars, which"
            + "\ndrive away from each other in several hours. Initial distance of S is known");
        double initialS = 385;
        double v1, v2, t;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the speed(km/h) of 1st car:");
        v1 = scanner.nextDouble();
        System.out.println("Please enter the speed(km/h) of 2nd car:");
        v2 = scanner.nextDouble();
        System.out.println("Please enter the time(hours) elapsed:");
        t = scanner.nextDouble();
        double s = C19_DriveAway.distanceInFewHrs(initialS, v1, v2, t);
        System.out.println("Distance b/t two cars in " + t + " hours is " + s +
                " Kilometres.");
    }
}



package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C05 {

    public static void main(String[] args) {
        System.out.println("Task 5: Calculate the arithmetical and geometrical"
            + "\naverge of numbers A and B.");        
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A:");
        a = scanner.nextDouble();
        System.out.println("Please enter B:");
        b = scanner.nextDouble();
        double arithmeticalAv = C05_Average.calculateArAv(a, b);
        double geomitricalAv = C05_Average.calculateGeomAv(a, b);
        System.out.println("Arithmetical average of A and B is " + arithmeticalAv);
        System.out.println("Geometrical average of A and B is " + geomitricalAv);   
    }
}

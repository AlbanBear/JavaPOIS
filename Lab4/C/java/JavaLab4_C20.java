

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C20 {
    public static void main(String[] args) {
        System.out.println("Task 20: Solve the equation Ax + B = 0."
                + "\nA and B are input from keyboard. A cannot equal 0");
        double a = 0;
        double b;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter A:");
        while (a==0){
            a=scanner. nextDouble();
        }  
        System.out.println("Please enter B:");
        b = scanner.nextDouble();
        double x = C20_LinearEquation.findX(a, b);
        System.out.println("X equals "+x);
}
    }


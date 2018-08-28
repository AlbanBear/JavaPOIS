

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C07 {

    public static void main(String[] args) {
        System.out.println("Task 7: Calculate the length of hypotenuse C and "
            + "\nperimeter of right triangle."
                + "\nLengths of catheti A and B are input from keybord.");        
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of cathetus A:");
        a = scanner.nextDouble();
        System.out.println("Please enter the length of cathetus B:");
        b = scanner.nextDouble();
        double c = C07_Hypotenuse.calculateHypotenuse(a, b);
        double perimeter = C07_Hypotenuse.calculatePerimeter(a, b);
        System.out.println("Length of hypotenuse C is " + c);
        System.out.println("Perimeter is " + perimeter);   
    }
 
}

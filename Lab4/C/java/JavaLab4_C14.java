

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C14 {
    public static void main(String[] args) {
        double t;
        System.out.println("Task 14: Convert degrees Celsius to Fahrenheit and vice-versa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature:");
        t = scanner.nextDouble();
        double f = C14_Temperature.convertCToF(t);
        double c = C14_Temperature.convertFToC(t);
        System.out.println(t + " Degrees Celsius is " + f + " Degrees Fahrenheit.");
        System.out.println(t + " Degrees Fahrenheit is " + c + " Degrees Celsius.");
    }
    
}

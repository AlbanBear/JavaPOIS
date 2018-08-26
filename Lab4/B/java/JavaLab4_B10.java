

package javalab4_b;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_B10 {
    public static void main(String[] args) {
        System.out.println("Task 10: Find what century is the input year");
        int year, century;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        year = scanner.nextInt();
        century = B10_Century.calculateCentury(year);
        System.out.println(year +" is the year of "+ century + " century");
    }
}

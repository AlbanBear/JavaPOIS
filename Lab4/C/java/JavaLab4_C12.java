

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C12 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Task 12: Swap two variables without adding "
            + "\ntemporary one.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter variable A:");
        a = scanner.nextInt();
        System.out.println("Please enter variable B:");
        b = scanner.nextInt();  
        a = C12_VarSwap.varSwapA(a, b);
        b = C12_VarSwap.varSwapB(a, b);
        System.out.println("A = "+ a + "\nB = "+ b);
     
    }
}

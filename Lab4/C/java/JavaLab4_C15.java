

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C15 {
    public static void main(String[] args) {
        double a, ex;
        System.out.println("Task 15: Convert Euros to US Dollars and vice-versa");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount of money:");
        a = scanner.nextDouble();
        System.out.println("Please enter exchance rate EUR/USD:");
        ex = scanner.nextDouble();
        double eur = C15_Currency.convertUSDToEUR(a, ex);
        double usd = C15_Currency.convertEURToUSD(a, ex);
        System.out.println(a + " Euros is " + usd + " US Dollars.");
        System.out.println(a + " US Dollars is " + eur + " Euros.");
    }
    
}


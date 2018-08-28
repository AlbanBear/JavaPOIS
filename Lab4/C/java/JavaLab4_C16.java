

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C16 {
    public static void main(String[] args) {
        double chw, jelw, chp, jelp;
        System.out.println("Task 16: Calculate how much is 1kg of chocolate candies"
                + "\nand 1kg of jellies, and how much jellies are cheaper than chocolates"
                + "Information about total weight and total price"
                + "\nof chocate candies and jellies are input from keyboard");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter total weight of chocolate candies:");
        chw = scanner.nextDouble();
        System.out.println("Please enter total price of chocolate candies:");
        chp = scanner.nextDouble();        
        System.out.println("Please enter total weight of jellies:");
        jelw = scanner.nextDouble();
        System.out.println("Please enter total price of jellies:");
        jelp = scanner.nextDouble();
        double ch1kg = C16_SweetsCalculator.oneKgOfChocolates(chw, chp);
        double jel1kg = C16_SweetsCalculator.oneKgOfJellies(jelw, jelp);
        double dif = C16_SweetsCalculator.difference(chw, chp, jelw, jelp);
        System.out.println("1 kg of chocolate candies costs "+ ch1kg + " Roubles");
        System.out.println("1 kg of jellies costs "+ jel1kg + " Roubles");
        System.out.println("1 kg of jellies is "+ (int)dif + "-times cheaper than "
                + "1 kg of chocote candies");
    }
}

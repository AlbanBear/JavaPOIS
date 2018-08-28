

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C17 {
    public static void main(String[] args) {
        System.out.println("Task 17: Calculate the distance traveled by boat, which at first moved"
                + "\n with the stream of the river, than against the stream.");
        double boatSpeed = 35.7;
        double streamSpeed = 2.5;
        double timeWithTheStream, timeAgainstTheStream;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter time(hours) of travelling with the stream:");
        timeWithTheStream = scanner.nextDouble();
        System.out.println("Please enter time(hours) of travelling against the stream:");
        timeAgainstTheStream = scanner.nextDouble(); 
        double dist = C17_BoatDistance.distanceTraveled(timeWithTheStream, timeAgainstTheStream, 
                boatSpeed, streamSpeed);
        System.out.println("Boat traveled "+dist+" Kilometres");
    }
}

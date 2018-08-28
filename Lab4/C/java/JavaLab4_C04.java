

package javalab4_C;

import java.util.Scanner;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_C04 {

    public static void main(String[] args) {
        System.out.println("Task 4: Calculate the volume and the surface area of the"
                + "\ncube with the length of edge A.");        
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the edge A:");
        a = scanner.nextDouble();
        double volume = C04_CubeCalculator.calculateVolume(a);
        double area = C04_CubeCalculator.calculateSurfaceArea(a);
        System.out.println("Volume of the cube is " + volume);
        System.out.println("Surface area of the cube is " + area);        
    }
  }
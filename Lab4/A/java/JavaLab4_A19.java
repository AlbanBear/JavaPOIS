
package javalab4_A;

import static java.lang.Math.sqrt;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A19 {
      public static void main(String[] args) {
      System.out.println ("Task 18: The triangle is specified by the sides A, B and C."
              + "\nIs this triangle right and isosceles?");
      double a = 6;
      double b = 6;
      double c = 9;

      boolean result = Logic.checkIfRightAndIsoscelesTriangle(a, b, c);
      System.out.println ("Side A: "+a);
      System.out.println ("Side B: "+b);
      System.out.println ("Side C: "+c);
      System.out.println ("Answer: "+result);
   }
}

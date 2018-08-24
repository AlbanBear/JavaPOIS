
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A15 {
      public static void main(String[] args) {
      System.out.println ("Task 15: Can numbers A, B and C be sides if triangles?");
      double a = 3;
      double b = 4;
      double c = 6;
      boolean result = Logic.checkIfSidesOfTriangle(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
}

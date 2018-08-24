
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A08 {
    
      public static void main(String[] args) {
      System.out.println ("Task 8: Are there at least one even among A, B and C?");
      int a = 5;
      int b = 3;
      int c = 13;
      boolean result = Logic.checkIfAtLeastOneEven(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
}

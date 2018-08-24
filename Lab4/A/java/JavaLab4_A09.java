
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A09 {
    
      public static void main(String[] args) {
      System.out.println ("Task 9: Are there only one even among A, B and C?");
      int a = 5;
      int b = 3;
      int c = 13;
      boolean result = Logic.checkIfOnlyOneEven(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
}

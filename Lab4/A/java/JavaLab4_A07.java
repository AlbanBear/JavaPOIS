
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A07 {
      public static void main(String[] args) {
      System.out.println ("Task 7: Are numbers A, B and C even?");
      int a = 6;
      int b = 4;
      int c = 18;
      boolean result = Logic.checkIfEven(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
}

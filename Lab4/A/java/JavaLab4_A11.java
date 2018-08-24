
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A11 {
     
      public static void main(String[] args) {
      System.out.println ("Task 11: Is the majority of numbers among A, B and C even??");
      int a = 8;
      int b = 7;
      int c = 9;
      boolean result = Logic.checkIfMajorityIsEven(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
}


package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A13 {
      public static void main(String[] args) {
      System.out.println ("Task 13: Is number N parindrome (reads the same backward as forward)?");
      int n = 2442;
      boolean result = Logic.checkPalindrome(n);
      System.out.println ("N="+n);
      System.out.println ("Answer: "+result);
   }
}

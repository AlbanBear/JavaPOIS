
package javalab4_A;

/*
@author Ivan Panamarou
*/
public class JavaLab4_A01 {

   public static void main(String[] args) {
      System.out.println ("Task 1: Are numbers A, B and C different?");
      double a = 3.62;
      double b = 4.70;
      double c = -5.20;
      boolean result = Logic.checkIfDifferent(a, b, c);
      System.out.println ("A="+a);
      System.out.println ("B="+b);
      System.out.println ("C="+c);
      System.out.println ("Answer: "+result);
   }
   
}

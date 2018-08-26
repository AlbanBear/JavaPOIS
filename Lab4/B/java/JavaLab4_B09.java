

package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_B09 {
   public static void main(String[] args) {
       System.out.println("Task 9: How many squares with side A will "
       + "\ngo into the rectangle with sides B and C? How much area is left?");
       double a = 3.25;
       double b = 18.57;
       double c = 28.93;
       int sqCounter = B09_SquareCounter.countSquares(a, b, c);
       double frArea = B09_SquareCounter.freeArea(a, b, c);
       System.out.println(sqCounter + " squares will go into rectangle");
       System.out.println("Blank area: " + frArea);
   }
}

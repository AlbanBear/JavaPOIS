

package javalab4_b;

/**
 * @author Ivan Panamarou
 */
public class B09_SquareCounter {

    public static int countSquares(double a, double b, double c){
       int count = (int)(b/a)*(int)(c/a);
       return count;   
    }
    public static double freeArea (double a, double b, double c){
        double area = (b*c)-((int)(b/a)*(int)(c/a)*(a*a));
        return area;
    }
}

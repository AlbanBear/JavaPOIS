

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C07_Hypotenuse {

    public static double calculateHypotenuse(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        return c;
    }
    public static double calculatePerimeter(double a, double b){
        double perimeter = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)) + a + b;
        return perimeter;
    }    
}

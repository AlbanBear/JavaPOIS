

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C13_DegreesRadians {

    public static double degreesToRadians (double a){
        double rad = a * Math.PI / 180;
        return rad;
    }
    public static double radiansToDegrees (double a){
        double deg = a * 180 / Math.PI;
        return deg;
    }
}

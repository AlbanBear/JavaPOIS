

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C19_DriveAway {
    public static double distanceInFewHrs(double initialS, double v1,
            double v2, double t){
        double s = initialS + t * (v1 + v2);
        return s;
    }
}

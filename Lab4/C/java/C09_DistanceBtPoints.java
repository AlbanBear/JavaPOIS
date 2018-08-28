

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C09_DistanceBtPoints {

    public static double DistanceBtPoints(double x1, double y1, double x2, double y2){
        double dist = Math.sqrt(Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2));
        return dist;
    }
}

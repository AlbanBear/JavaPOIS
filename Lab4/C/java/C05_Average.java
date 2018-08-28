

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C05_Average {

    public static double calculateArAv(double a, double b){
        double arAv = (a + b) / 2;
        return arAv;
    }
    public static double calculateGeomAv(double a, double b){
        double geomAv = Math.sqrt(a*b);
        return geomAv;
    }
}

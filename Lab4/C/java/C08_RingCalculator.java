

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C08_RingCalculator {

    public static double calculateRingArea(double r1, double r2){
        double area;
        if (r1 > r2){
            area = (Math.PI * r1* r1)-(Math.PI * r2 *r2);
        }
        else{
            area = (Math.PI * r2* r2)-(Math.PI * r1 *r1);
        }
        return area;
    }
}

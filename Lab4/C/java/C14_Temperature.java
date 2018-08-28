

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C14_Temperature {
    public static double convertCToF (double t){
        double f =  t * 9 / 5 + 32;
        return f;
    }
    public static double convertFToC (double t){
        double c = (t - 32)* 5 / 9;
        return c;
    }
}



package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C15_Currency {
    public static double convertUSDToEUR (double a, double ex){
        double eur =  a * ex;
        return eur;
    }
    public static double convertEURToUSD (double a, double ex){
        double usd = a * (1 / ex);
        return usd;
    }
}

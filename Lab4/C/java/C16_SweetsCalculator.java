

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C16_SweetsCalculator {
    public static double oneKgOfChocolates (double chw, double chp){
        double ch1kg =  chp / chw;
        return ch1kg;
    }
    public static double oneKgOfJellies (double jelw, double jelp){
        double jel1kg =  jelp / jelw;
        return jel1kg;
    }
    public static double difference (double chw, double chp, double jelw, double jelp){
        double dif = (chp / chw) / (jelp / jelw);
        return dif;
    }
        
}

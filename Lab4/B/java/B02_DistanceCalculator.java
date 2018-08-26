

package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class B02_DistanceCalculator {
        public static double calculateMetres(int cm){
        double m = (double)cm / 100;
        return m;
    }
    
        public static double calculateKilometres(int cm){
        double km = (double)cm / 100 / 1000;
        return km;
    }    
        
}

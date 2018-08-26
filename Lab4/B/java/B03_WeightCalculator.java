
package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class B03_WeightCalculator {
        public static double calculateKgs(int gr){
        double kg = (double)gr / 1000;
        return kg;
    }
    
        public static double calculateCs(int gr){
        double c = (double)gr / 1000 / 100;
        return c;
    }
        
        public static double calculateTs(int gr){
        double t = (double)gr / 1000 / 1000;
        return t;
    }
 
}

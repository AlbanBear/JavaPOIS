

package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class B01_SizeCalculator {
        public static double calculateKBs(int sizeB){
        double sizeKB = (double)sizeB / 1024;
        return sizeKB;
    }
    
        public static double calculateMBs(int sizeB){
        double sizeMB = (double)sizeB / 1024 / 1024;
        return sizeMB;
    }
        
        public static double calculateGBs(int sizeB){
        double sizeGB = (double)sizeB / 1024 / 1024 / 1024;
        return sizeGB;
    }
        public static double calculateTBs(int sizeB){
        double sizeTB = (double)sizeB / 1024 / 1024 / 1024/ 1024;
        return sizeTB;
    }        
        
}

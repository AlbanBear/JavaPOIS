

package javalab4_b;

/**
 * @author Ivan Panamarou
 */
public class B06_Average {
        public static double arithmeticalAv(int n){
            int count = 0;
            double sum = 0;
            while (n != 0) 
                {
                count +=1;
                sum += n % 10;
                n /= 10;
                }
            return sum/count;          
    }
        public static double geometricalAv(int n){
            double count = 0;
            double pr = 1;
            while (n != 0) 
                {
                count +=1;
                pr *= n % 10;
                n /= 10;
                }
            return Math.pow(pr, 1/count);          
    }
}

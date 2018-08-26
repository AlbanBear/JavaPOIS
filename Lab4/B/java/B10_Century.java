

package javalab4_b;

/**
 * @author Ivan Panamarou
 */
public class B10_Century {
    public static int calculateCentury(int year) {
        int century;
        if (year%100==0){
            century = year/100;
        }
        else {
            century = year/100 + 1;
        }
        return century;
    }
}

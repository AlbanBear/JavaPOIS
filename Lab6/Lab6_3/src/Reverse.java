

package javalab6_3;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class Reverse {
    public static int reverseInt(int n){
        int m = 0;
        while(n != 0){
            m = m*10 + n%10;
            n /= 10;
        }
        return m;
    }
}

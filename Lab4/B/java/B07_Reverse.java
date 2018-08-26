

package javalab4_b;

/**
 * @author Ivan Panamarou
 */
public class B07_Reverse {
    public static int reverse(int n){
        int res =0;
        while(n != 0){
            res = res*10 + n%10;
            n /= 10;
        }
        return res; 
    }
}

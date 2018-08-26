

package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class B05_DigitsProduct {
    public static int digitsProduct(int n){
        int pr=1;
        while (n != 0) 
        {
        pr *= n % 10;
        n /= 10;
        }
        return pr;          
    }
}

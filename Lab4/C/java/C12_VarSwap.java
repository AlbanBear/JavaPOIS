

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C12_VarSwap {

    public static int varSwapA(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return a;
    }
    public static int varSwapB(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return b;
    }
}

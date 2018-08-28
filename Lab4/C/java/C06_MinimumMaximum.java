

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C06_MinimumMaximum {

    public static String findMinimum(double a, double b, double c){
        String min = null;
        if (a<b && a<c){
            min = "A";
        }
        if (b<a && b<c){
            min = "B";
        }
        if (c<a && c<b){
            min = "C";
        }
        return min;   
    }
    public static String findMaximum(double a, double b, double c){
        String max = null;
        if (a>b && a>c){
            max = "A";
        }
        if (b>a && b>c){
            max = "B";
        }
        if (c>a && c>b){
            max = "C";
        }
      
        return max;
    }    
}

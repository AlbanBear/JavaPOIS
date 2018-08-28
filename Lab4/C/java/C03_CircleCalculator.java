

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C03_CircleCalculator {
    public static double calculateCircumference(double r){
    double circumference = 2 * Math.PI * r;
    return circumference;
    }
    
    public static double calculateArea(double r){
    double area = Math.PI * Math.pow(r, 2);
    return area;   
    }
}

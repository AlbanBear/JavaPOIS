

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C10_RectangleByApices {

    public static double calculateArea (double x1, double y1, double x2, double y2){
        double area = (x2 - x1) * (y2 - y1);
        return area;
    }
    public static double calculatePerimeter (double x1, double y1, double x2, double y2){
        double perimeter = 2*((x2 - x1) + (y2 - y1));
        return perimeter;
    }
}

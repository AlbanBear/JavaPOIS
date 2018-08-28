
package javalab4_C;


/**
 * @author Ivan Panamarou
 */
public class C11_TriangleByApices {
    public static double calculatePerimeter (double x1, double y1, double x2, 
            double y2, double x3, double y3)
    {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double perimeter = a + b + c;
        return perimeter;
    }
        public static double calculateArea (double x1, double y1, double x2, 
            double y2, double x3, double y3)
    {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        double c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double hp = (a + b + c) / 2;
        double area = Math.sqrt(hp * (hp-a) * (hp-b) * (hp-c));
        return area;
        }
}

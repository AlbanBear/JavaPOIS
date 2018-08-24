
package javalab4_A;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_A20 {
       public static void main(String[] args) {
       System.out.println ("Task 20: Does the point(x,y) lie in the rectanle,"
               + "\nwhich has upper left apex with coordinates (x1,y1),"
               + "\nlower right apex with coordinates (x2,y2)"
               + "and sides, which are parallel to coordinate axes?");
       double x = -0.98;
       double y = 2.21;
       double x1 = -1.43;
       double y1 = 3.65;
       double x2= 2.32;
       double y2 = -1.44;
       boolean result = Logic.checkPointInRectangle(x,y,x1,y1,x2,y2);
       System.out.println ("Abscissa: "+x);
       System.out.println ("Ordinate: "+y);
       System.out.println ("Upper left apex: ("+x1+", "+y1+")");
       System.out.println ("Lower left apex: ("+x1+", "+y2+")");
       System.out.println ("Upper right apex: ("+x2+", "+y1+")");
       System.out.println ("Lower right apex: ("+x2+", "+y2+")");
       System.out.println ("Answer: "+result);
    }

}

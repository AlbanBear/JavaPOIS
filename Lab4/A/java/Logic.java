
package javalab4_A;

/**
 *
 * @author Ivan Panamarou 
 */

public class Logic {
        //A01
        public static boolean checkIfDifferent (double a, double b, double c){
        return a != b && b != c && a != c;
        }
        //A02
        public static boolean checkIfCoincident (double a, double b, double c){
        return a == b || b == c || a == c;
        }
        //A03
        public static boolean checkIfPositive (double a, double b, double c){
        return a >=0 && b >=0 && c >= 0;
        }
        //A04
        public static boolean checkIfAtLeastOnePositive (double a, double b, double c){
        return a >=0 || b >=0 || c >= 0;
        } 
        //A05
        public static boolean checkIfOnlyOnePositive (double a, double b, double c){
        return (a >=0 && b < 0 && c < 0) || 
               (b >=0 && a < 0 && c < 0) || 
               (c >= 0&& b < 0 && a < 0);
        }
        //A06
        public static boolean checkIfMajorityIsPositive (double a, double b, double c){
        return (a >=0 && b >= 0 && c < 0) || 
               (b >=0 && a < 0 && c >= 0) || 
               (c >= 0&& b < 0 && a >= 0) ||
               (a >=0 && b >= 0 && c >= 0);
        }
        //A07
        public static boolean checkIfEven (int a, int b, int c){
        return (a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0);
        }
        //A08
        public static boolean checkIfAtLeastOneEven (int a, int b, int c){
        return (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
        }
        //A09
        public static boolean checkIfOnlyOneEven (int a, int b, int c){
        return (a % 2 == 0) && (b % 2 != 0) && (c % 2 != 0)|| 
               (a % 2 != 0) && (b % 2 == 0) && (c % 2 != 0)||
               (a % 2 != 0) && (b % 2 != 0) && (c % 2 == 0) ;
        } 
        //A10
        public static boolean checkIfSameParity (int a, int b, int c){
        return (a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0)|| 
               (a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0) ;
        } 
        //A11
        public static boolean checkIfMajorityIsEven (int a, int b, int c){
        return (a % 2 == 0) && (b %2 == 0) && (c %2 != 0) || 
               (a % 2 != 0) && (b %2 == 0) && (c %2 == 0) || 
               (a % 2 == 0) && (b %2 != 0) && (c %2 == 0) ||
               (a % 2 == 0) && (b %2 == 0) && (c %2 == 0) ;
        }
        //A12
        public static boolean checkAscendingSequenceOfDigits(int n){
        int un = n % 10;
        int tn = (n / 10) % 10;
        int hd = (n / 100) % 10;
        int th = n / 1000;
        return th < hd && hd < tn && tn < un;
        }
        //A13
        public static boolean checkPalindrome(int n){
        int un = n % 10;
        int tn = (n / 10) % 10;
        int hd = (n / 100) % 10;
        int th = n / 1000;
        return th == un && tn == hd;
        }
        //A14
        public static boolean checkIfPointInQuadrantII(double x, double y){
        return x < 0 && y > 0;
        }
        //A15
        public static boolean checkIfSidesOfTriangle (double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
        } 
        //A16
        public static boolean checkIfEquilateralTriangle (double a, double b, double c){
        if (!(a + b > c && a + c > b && b + c > a)){
        System.out.println ("The triangle cannot be specified by this sides!");  
        }        
        return a == b && b == c && a == c ;
        }
        //A17
        public static boolean checkIfIsoscelesTriangle (double a, double b, double c){
        if (!(a + b > c && a + c > b && b + c > a)){
        System.out.println ("The triangle cannot be specified by this sides!");  
        }
        return (a == b || b == c || a == c)&&
        (a + b > c && a + c > b && b + c > a);
        } 
        //A18
        public static boolean checkIfRightTriangle (double a, double b, double c){
        if (!(a + b > c && a + c > b && b + c > a)){
        System.out.println ("The triangle cannot be specified by this sides!");  
        }
        return ((a*a + b*b == c*c)||
               (b*b + c*c == a*a)||
               (a*a + c*c == b*b))&&
               (a + b > c && a + c > b && b + c > a);
        }
        //A19
        public static boolean checkIfRightAndIsoscelesTriangle (double a, double b, double c){
        if (!(a + b > c && a + c > b && b + c > a)){
        System.out.println ("The triangle cannot be specified by this sides!");  
        }
        return ((a*a + b*b == c*c)||
               (b*b + c*c == a*a)||
               (a*a + c*c == b*b))&&
               (a == b || b == c || a == c)&& 
               (a + b > c && a + c > b && b + c > a);
        }     
        //A20
        public static boolean checkPointInRectangle(double x, double y, 
                double x1, double y1, double x2, double y2) {

        return (x > x1 && x < x2) && (y > y2 && y < y1);
        }
}

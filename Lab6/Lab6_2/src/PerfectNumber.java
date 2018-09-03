
package javalab6_2;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        int sum = 1;
        for (int i = 2; i <= number/2 ; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }
}

/*
* Task 2:
* Recognize if input number is perfect or not
*/

package javalab6_2;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab6_2 {
    public static void main(String[] args) {
        int number = UserInput.input("Please enter number (integer): ");
        if (PerfectNumber.isPerfectNumber(number)){
            View.print(number + " is perfect number");
        }
        else {
            View.print(number + " is imperfect number");
        }
    }
}

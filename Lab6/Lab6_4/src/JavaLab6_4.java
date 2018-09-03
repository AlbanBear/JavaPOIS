

package javalab6_4;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab6_4 {
    public static void main(String[] args) {
        int n = UserInput.input("Please enter number N(integer): ");
        View.print("Integer N: "+n);
        View.print("Sum of digits: "+Logic.sumDigits(n));
        View.print("Quantity of digits: "+Logic.countDigits(n));
        View.print("Maximal digit: "+Logic.findMaximalDigit(n));
        View.print("Is palindrome?: "+Logic.isPalindrome(n));
        View.print("Is prime number?: "+Logic.isPrimeNumber(n));
        View.print("Prime divisors: "+Logic.findPrimeDivisors(n));
        int a = UserInput.input("Please enter number A(integer): ");
        int b = UserInput.input("Please enter number B(integer): ");
        View.print("A: "+a+"\nB:"+b);
        View.print("Greatest common divisor: "+Logic.findGreatestCommonDivisor(a, b));
        View.print("Least common multiple: "+Logic.findLeastCommonMultiple(a, b));
    }
}

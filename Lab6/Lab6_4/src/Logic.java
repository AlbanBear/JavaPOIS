
package javalab6_4;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class Logic {
    
    public static int sumDigits(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int countDigits(int n){
        int count = 0;
        while (n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static int countDifferentDigits(int n){
        int countDifferentDigits = 0;
        int countDigits[] = new int[10];
        
        n = n > 0 ? n : -n;
        while (n > 0) {
			int i = n % 10;
			countDigits[i]++;
			n = n / 10;
		}
		for (int j = 0; j < countDigits.length; j++) {
			if (countDigits[j] > 0) {
				countDifferentDigits++;
			}
		}

		return countDifferentDigits;
    }
    public static int findMaximalDigit(int n){
        int max = 0;
        while (n != 0){
            if (n % 10 > max){
                max = n % 10;
                
            }
            n /= 10;
        }
        return max;
    }
    public static String isPalindrome (int n) {
        String result;
        int initial = n;
        int reversed = 0;
        while(n != 0){
            reversed = reversed *10 + n%10;
            n /= 10;
        }
        if (initial==reversed){
            result = "Yes";
        }
        else {
            result = "No";
        }
        return result;
    }
    public static String isPrimeNumber (int n) {
        String result = null;
        n = n > 0 ? n : -n;
        for (int i = 2; i < Math.sqrt(n)+1; i++){
            if (n % i == 0){
                result = "No";
                break;
            }
            else {
                result = "Yes";
            }
        }
        return result;
    }
    public static String findPrimeDivisors (int n){
        String result = "1";
        n = n > 0 ? n : -n;
        for (int i = 2; i <= n; i++) {
            if(n % i == 0){
                result += " " + Integer.toString(i);
                break;
            }
        }
        return result;
    }
    public static int findGreatestCommonDivisor (int a, int b){
        int gcd;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        gcd = a;
        return gcd;
    }
    public static int findLeastCommonMultiple (int a, int b){
        int lcm;
        int a_ = a;
        int b_ = b;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        lcm = (a_ * b_)/a;
        return lcm; 
    }
}

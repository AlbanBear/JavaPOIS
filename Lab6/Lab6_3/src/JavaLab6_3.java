

package javalab6_3;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab6_3 {
    public static void main(String[] args) {
        int n = UserInput.input("Please enter number N(integer): ");
        int m = Reverse.reverseInt(n);
        View.print("Reversed number M is "+m);
    }
}

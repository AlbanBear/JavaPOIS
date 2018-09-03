/*
* Task 1:
* Develop Heads or Tails emulator. Quantity of heads and tails should be displayed.
*/

package javalab6_1;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab6_1 {
    public static void main(String[] args) {
        int cth = UserInput.input("Please enter number of throws: ");
        int heads = HeadsOrTails.throwCoin(cth);
        View.print("Heads: "+heads);
        View.print("Tails: "+(cth - heads));
    }
}

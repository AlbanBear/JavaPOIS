/*
* Task 1: A young dragon grows three heads each year, but after he turns 200 -
* - only two, and after he is 300 - only one head. Develop the program, that counts
* how many heads and eyes has the dragon who is N years old.
*/


package javalab5_1;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab5_1 {

 
    public static void main(String[] args) {
        int n, heads, eyes;

        n = UserInput.input("Please enter dragon's age: ");
        heads = DragonHeads.countHeads(n);
        eyes = DragonHeads.countEyes(n);
        View.print("The dragon has " + heads + " heads and " + eyes + " eyes.");
    }
}

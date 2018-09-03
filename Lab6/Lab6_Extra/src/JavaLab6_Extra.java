

package javalab6_extra;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab6_Extra {
    public static void main(String[] args) {
        while (true) {
			
	View.print("Programm secretly generates from 0 to 100."
                + "\nTry to guess the number.");
	View.print(GuessTheNumber.guessTheNumber()); 
			
			
        if (!GuessTheNumber.continueOrNot("\nDo you want to continue?")) {
            break;
            }
        }
    }
}

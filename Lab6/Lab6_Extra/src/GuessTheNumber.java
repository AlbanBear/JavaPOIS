

package javalab6_extra;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class GuessTheNumber {
    public static final int ATTEMPTS = 10;
    public static final int RANGE = 100;

    public static String guessTheNumber() {

	int number;
	int generatedNumber;
	int count = 0;
	String message = null;

	Random random = new Random();
	generatedNumber = random.nextInt(RANGE);

	while (count < ATTEMPTS) {
	count++;
	number = UserInput.input("Please enter your number: ");
            if (number == generatedNumber) {
                    message = "Congratulations! You've guessed the number!\n" + count + 
                            " out of " + ATTEMPTS + " attemps are taken";
                    break;
            } 
            else if (number < generatedNumber) {
                    message = "Your number is less than generated one. \nPlease try again.";
                    System.out.println(message);
            } 
            else if (number > generatedNumber) {
                    message = "Your number is more than generated one. \nPlease try again.";
                    System.out.println(message);
            }
            if (count == ATTEMPTS && number != generatedNumber) {
                    message = "Sorry, you've run out of attempts! \nGAME OVER!!!.";
            }
	
        }

	return message;
    }
    public static boolean continueOrNot(String question) {
	System.out.println(question + "Press Y (yes) or N (no)");
	Scanner scanner = new Scanner(System.in);
	String answer = scanner.next().toUpperCase();
	return answer.equals("Y");
	}
}

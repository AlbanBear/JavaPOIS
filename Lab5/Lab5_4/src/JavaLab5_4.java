/*
* Task 4:
* Develop a program that recognizes if letter is vowel or consonant
*/

package javalab5_4;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab5_4 {
    public static void main(String[] args) {
        char letter = UserInput.input("Please enter the letter: ");
        View.print("1) Letter " + letter + " " + VowelOrConsonant.isVowelOrConsonant1(letter));
        View.print("2) Letter " + letter + " " + VowelOrConsonant.isVowelOrConsonant2(letter));
        View.print("3) Letter " + letter + " " + VowelOrConsonant.isVowelOrConsonant3(letter));
        View.print("4) Letter " + letter + " " + VowelOrConsonant.isVowelOrConsonant4(letter));        
    }
}



package javalab5_extra2;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab5_Extra2 {
    public static void main(String[] args) {
        int number = UserInput.input("Please enter three digit integer number:");
        View.print("Number in words: "+NumberInWords.getInWords(number));
            
    }
    
}

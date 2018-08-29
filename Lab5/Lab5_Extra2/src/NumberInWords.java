

package javalab5_extra2;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class NumberInWords {
    static final String[] DIGIT1 = {"", "one ", "two ", "three ", "four ", "five ", 
        "six ", "seven ", "eight ", "nine "};
    static final String[] FROM11TO19 = {"eleven ", "twelve ", "thirteen ", "fourteen ",
        "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
    static final String[] DIGIT10 = {"", "ten ", "twenty ", "thirty ", "fourty ",
        "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
    static final String[] DIGIT100 = {"", "one hundred ", "two hundred ", "three hundred ", 
        "four hundred ", "five hundred ", "six hundred ", "seven hundred ", "eight hundred ", 
        "nine hundred "};
    public static String getInWords(int number){
        String words = null;
        if (number == 0){
            words = "zero";   
        }
        else{
            words = DIGIT100[number/100];
            if (number % 100 > 10 && number % 100 < 20) {
                words += FROM11TO19[number % 100 - 11];
            } 
            else { 
                words += DIGIT10[number % 100 / 10];
                words += DIGIT1[number % 10];
                } 
            }
        return words;
    }
}

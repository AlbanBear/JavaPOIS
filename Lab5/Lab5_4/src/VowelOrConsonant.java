

package javalab5_4;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class VowelOrConsonant {

    public static String isVowelOrConsonant1(char letter){
        letter = Character.toUpperCase(letter);
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' 
                ||letter == 'U' || letter == 'Y'){
            return "is vowel";
        }
        else{ 
            return "is consonant";
        }
    }
    public static String isVowelOrConsonant2(char letter){
        letter = Character.toUpperCase(letter);
            switch (letter) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':

                return "is vowel";

        }
        return "is consonant";
    }
    public static String isVowelOrConsonant3(char letter){
         if("AEYUIOaeyuio".contains(Character.toString(letter))) {
            return "is vowel";
            
        } else {
            return "is consonant";
        
        }
    }
    public static String isVowelOrConsonant4(char letter){
        if("AEYUIOaeyuo".indexOf(letter)== -1) {
            return "is consonant";
            
        } else {
            return "is vowel";
            
        }
    }
        
}


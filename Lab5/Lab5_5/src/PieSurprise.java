

package javalab5_5;
import java.util.Random;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class PieSurprise {
    static final String[] FILLING = {"apple", "blueberry", "cherry", "feta", 
        "ham", "jam", "lemon", "mushrooms", "Nutella", "onion", "potatoes", 
        "strawberry", "tuna"};
    
    public static int getRandomNumber(){
        return new Random().nextInt(FILLING.length);

    }
    public static String getFilling (){
        return FILLING[getRandomNumber()];
    }
}

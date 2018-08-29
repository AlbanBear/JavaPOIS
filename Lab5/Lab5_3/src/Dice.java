

package javalab5_3;
import java.util.Random;
/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class Dice {

    public static final int MAX = 6;
    public static int rollTheDice(){
        int roll1 = new Random().nextInt(MAX)+1;
        int roll2 = new Random().nextInt(MAX)+1;
        return roll1+roll2;
    }
}

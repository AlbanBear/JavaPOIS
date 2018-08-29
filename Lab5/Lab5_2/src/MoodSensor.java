

package javalab5_2;
import java.util.Random;
/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class MoodSensor {

    public static final String[] EMOJI_ARRAY = {"\uD83D\uDE03", "\uD83D\uDE04",
        "\uD83D\uDE06", "\uD83D\uDE0B", "\uD83D\uDE0D", "\uD83D\uDE10", "\uD83D\uDE11", 
        "\uD83D\uDE12", "\uD83D\uDE15", "\uD83D\uDE16", "\uD83D\uDE1C", "\uD83D\uDE1E",
        "\uD83D\uDE20", "\uD83D\uDE22", "\uD83D\uDE26", "\uD83D\uDE28", "\uD83D\uDE2E", 
        "\uD83D\uDE32", "\uD83D\uDE34"};
    
    public static int getRandomNumber(){
        return new Random().nextInt(EMOJI_ARRAY.length);

    }
    public static String getMood (){
        return EMOJI_ARRAY[getRandomNumber()];
    }
}

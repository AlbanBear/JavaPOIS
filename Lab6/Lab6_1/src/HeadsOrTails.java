

package javalab6_1;

import java.util.Random;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class HeadsOrTails {

    public static int throwCoin(int cth){
        Random random = new Random();
        int heads = 0;
        for (int i = 0; i < cth; i++){
            if(random.nextBoolean()){
                heads++;
            }
        }
       return heads; 
    }
}

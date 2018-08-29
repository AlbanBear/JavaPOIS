
package javalab5_1;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class DragonHeads {

    public static int countHeads (int n){
        int heads = 0;
        final int AGE1 = 200;
        final int AGE2 = 300;
        final int HEADS_BEFORE_AGE1 = 3;
        final int HEADS_AFTER_AGE1 = 2;
        final int HEADS_AFTER_AGE2 = 1;
        if (n < AGE1){
            heads = n * HEADS_BEFORE_AGE1;
        }
        if (n >= AGE1 && n < AGE2){
            heads = AGE1 * HEADS_BEFORE_AGE1 + (n - AGE1) * HEADS_AFTER_AGE1;
        }    
        if (n >= AGE2){
            heads = AGE1 * HEADS_BEFORE_AGE1 + (AGE2 - AGE1) * HEADS_AFTER_AGE1
                    + (n - AGE2) * HEADS_AFTER_AGE2;
        }    
        return heads;    
  
    }
    
    public static int countEyes (int n){
        return countHeads(n)*2;
    }
}

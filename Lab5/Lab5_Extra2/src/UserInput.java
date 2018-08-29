

package javalab5_extra2;

import java.util.Scanner;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class UserInput {
   private static Scanner scanner = new Scanner (System.in);
   
   public static int input(String msg){
        System.out.println(msg);
        return scanner.nextInt();       
   }
}

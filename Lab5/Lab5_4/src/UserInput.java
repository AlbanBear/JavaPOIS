

package javalab5_4;

import java.util.Scanner;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class UserInput {
   private static Scanner scanner = new Scanner (System.in);
   
   public static char input(String msg){
        System.out.println(msg);
        return scanner.next().charAt(0);       
   }
}

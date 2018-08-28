

package javalab4_C;

/**
 * @author Ivan Panamarou
 */
public class C17_BoatDistance {

    public static double distanceTraveled (double timeWithTheStream, 
            double timeAgainstTheStream, double boatSpeed, double streamSpeed){
        double dist = (boatSpeed + streamSpeed)*timeWithTheStream + 
                (boatSpeed - streamSpeed)*timeAgainstTheStream;
        return dist;
    }
}

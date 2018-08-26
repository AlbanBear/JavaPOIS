

package javalab4_B;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * @author Ivan Panamarou
 */
public class B04_TimeCalculator {
    public static int todayInHrs(){
        GregorianCalendar curCalendar = new GregorianCalendar();                              
        return curCalendar.get(Calendar.HOUR_OF_DAY);
              
    }

    public static int todayInMin(){ 
        GregorianCalendar curCalendar = new GregorianCalendar();              
        return curCalendar.get(Calendar.MINUTE) + curCalendar.get(Calendar.HOUR_OF_DAY) * 60;
              
    }    
    
    public static int todayInSec(){
        GregorianCalendar curCalendar = new GregorianCalendar();          
        return curCalendar.get(Calendar.SECOND) + curCalendar.get(Calendar.MINUTE) * 60  
                + curCalendar.get(Calendar.HOUR_OF_DAY) * 3600;
              
    }

}

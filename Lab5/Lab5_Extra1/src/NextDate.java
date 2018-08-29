

package javalab5_extra1;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class NextDate {

    public static String getNextDate (int day, int month, int year){
        String nextDate = null;
        
        if (day < 1 || day > 31 || (month == 2 && day >= 30)|| (((month == 4)||
                (month == 6)||(month == 9)||(month == 11)) && day > 30)||
                month < 1 || month > 12){
            View.print("Error! Invalid date!");
        }
        if ((day == 31)&&(month == 12)){
            day = 1;
            month = 1;
            year++; 
            nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
        }
        else if(month == 4||month == 6||month == 9||month == 11){
            if (day == 30){
                day = 1;
                month++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
            else if (day < 30) {
                day++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
        }
        else if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10){
            if (day == 31){
                day = 1;
                month++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
            else if (day < 31) {
                day++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
        }
        else if (month == 2 && (year % 4 != 0) ){
            if (day >= 29){
                View.print("Error! Invalid date!");
            }
            else if (day == 28){
                day = 1;
                month++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
            else if (day < 28) {
                day++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
        }
        
        else if (month == 2 && (year % 100 == 0) && (year % 400 != 0)){
            if (day >= 29){
                View.print("Error! Invalid date!");
            }
            else if (day == 28){
                day = 1;
                month++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
            else if (day < 28) {
                day++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
        }
        else if (month == 2 && (year % 100 == 0) && (year % 400 == 0)){
            if (day == 29){
                day = 1;
                month++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
            else if (day < 29) {
                day++;
                nextDate = Integer.toString(day)+"."+Integer.toString(month)+"."+
                    Integer.toString(year);
            }
        }
        return nextDate;
    }
}

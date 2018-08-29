/*
* Extra Task a:
* There are three integer numbers, that form a date of Gregorian calendar.
* Calculate the date of the next day. Do not use Time and Date Java Libraries
*/

package javalab5_extra1;

/**
 * @author Ivan Panamarou, POIS1709v1
 */
public class JavaLab5_Extra1 {
    public static void main(String[] args) {
        int day = UserInput.input("Enter day: ");
        int month = UserInput.input("Enter month: ");
        int year = UserInput.input("Enter year: ");
        View.print("The next date is "+NextDate.getNextDate(day, month, year));
    }
}

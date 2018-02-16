import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Lab2_2{
public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date currentdate = new Date();
        Date birthdate = new Date();
       
        System.out.println("Enter your birthdate:");
        String date = scanner.nextLine();
                
        try {
             birthdate = sdf.parse(date);
        } catch(Exception ex) {
            System.out.println(ex);
        }

	long lifeTime = lifeTime (currentdate, birthdate);

    System.out.println("Your birthday is " + birthdate);
	System.out.println("Today is " + currentdate);
	System.out.println("You live...");
	System.out.println("..." + Years(lifeTime) + " years");
	System.out.println("or " + Days(lifeTime) + " days");
	System.out.println("or " + Hours(lifeTime) + " hours");
	System.out.println("or " + Minutes(lifeTime) + " minutes");
	System.out.println("or " + Seconds(lifeTime) + " seconds");
    }

	public static long Years(long lifeTime) {
		return lifeTime/1000/60/60/24/365;		
	}

	public static long Days(long lifeTime) {
		return lifeTime/1000/60/60/24;		
	}

	public static long Hours(long lifeTime) {
		return lifeTime/1000/60/60;		
	}

	public static long Minutes(long lifeTime) {
		return lifeTime/1000/60;		
	}

	public static long Seconds(long lifeTime) {
		return lifeTime/1000;		
	}

	public static long lifeTime(Date today, Date birthday) {
		return today.getTime() - birthday.getTime();
	}
}

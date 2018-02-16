import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Lab2_2{
public static void main(String args[])
    {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
        Date currentdate = new Date();
        Date birthdate = new Date();
       
        System.out.println("Enter your birthdate and birthtime");
		System.out.println("(in dd.MM.yyyy HH.mm.ss format):");
        String date = scanner.nextLine();
                
        try {
             birthdate = formatter.parse(date);
        } catch(ParseException pEx) {
            System.out.println(pEx);
		
        }

	long lifeTime = lifeTime (currentdate, birthdate);

    System.out.println("Your birthday is " + birthdate);
	System.out.println("Today is " + currentdate);
	System.out.println("You live...");
	System.out.println("..." + years(lifeTime) + " years");
	System.out.println("or " + days(lifeTime) + " days");
	System.out.println("or " + hours(lifeTime) + " hours");
	System.out.println("or " + minutes(lifeTime) + " minutes");
	System.out.println("or " + seconds(lifeTime) + " seconds");
    }

	public static long years(long lifeTime) {
		return lifeTime/1000/60/60/24/365;		
	}

	public static long days(long lifeTime) {
		return lifeTime/1000/60/60/24;		
	}

	public static long hours(long lifeTime) {
		return lifeTime/1000/60/60;		
	}

	public static long minutes(long lifeTime) {
		return lifeTime/1000/60;		
	}

	public static long seconds(long lifeTime) {
		return lifeTime/1000;		
	}

	public static long lifeTime(Date today, Date birthday) {
		return today.getTime() - birthday.getTime();
	}
}

import java.util.Scanner;

public class Lab2_1{
	public static void main(String[] args){
		String name = "";
		String age = "";
		String famSt = "";
		String job = "";
		String pos = "";
		String hobby = "";
		String quote = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.println("How old are you?");
		age = scanner.nextLine();
		System.out.println("What is your family status (single/married/widowed/divorced)?");
		famSt = scanner.nextLine();
		System.out.println("Where do you work?");
		job = scanner.nextLine();
		System.out.println("What post do you take there?");
		pos = scanner.nextLine();
		System.out.println("Your hobbies?");
		hobby = scanner.nextLine();
		System.out.println("Your favourite quotation or aphorism?");
		quote = scanner.nextLine();
		System.out.println("****************************************************************");
		
		System.out.println("Your name is " + name +".");
		System.out.println("You are "+ age + " years old.");
		System.out.println("You are " + famSt+".");
		System.out.println("You work as " + pos +" at " + job +".");
		System.out.println("Your hobbies are " + hobby +".");
		System.out.println("Your favorite quotation/aphorism is " + quote+".");
		System.out.println("\n Have a nice day!");
		System.out.println(" ");
	}
}
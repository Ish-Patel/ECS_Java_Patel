package Assignment3;

import java.util.Scanner;

public class NameAgeSalary
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double sal;
		
		System.out.println("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.println("Hi, "+name+"! How old are you?");
		age = keyboard.nextInt();
				
		System.out.println("So you are "+age+"? I guess that's not too old, "+name+".");
		System.out.println("How much do you make per hour?");
		sal = keyboard.nextDouble();
		
		System.out.println("Wow, "+sal+" is a lot for your age!");
		
		keyboard.close();
	}
}

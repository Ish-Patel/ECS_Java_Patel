package Assignment3;

import java.util.Scanner;

public class Task1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, feet, inches;
		double weight;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh?");
		weight = keyboard.nextDouble();
		
		System.out.println("So your name is "+name+", you are "+age+" years old, you're "+feet+"'"+inches+"'', and your weight is "+weight+"lbs.");
		
		keyboard.close();
	}
}

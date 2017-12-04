package Assignment4;

import java.util.Scanner;

public class HowOldSpecifically
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("Hey, whats your name?");
		name = keyboard.next();
		
		System.out.print("Ok "+ name +", how old are you?");
		age = keyboard.nextInt();
		
		if (age < 16)
			{
				System.out.println("You cannot drive "+name+".");
			}
		else if (age >= 16)
			{
				if(age >= 18)
					{
						if(age > 24)
							{
								System.out.println("You can do whatever you want "+name+".");
							}
						else
							{
								System.out.println("You can vote but not rent a car, "+name+".");
							}
					}
				else
					{
						System.out.println("You can drive byt not vote "+name+".");
					}
			}
		keyboard.close();
	}
}
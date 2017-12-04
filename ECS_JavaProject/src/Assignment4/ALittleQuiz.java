package Assignment4;

import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int Q1, Q2, Q3, c;
		c = 0;
		
		System.out.println("Q1)	Guess a Number");
		System.out.println("	1)3");
		System.out.println("	2)5");
		System.out.println("	3)9");
		
		Q1 = keyboard.nextInt();
		
		if (Q1 == 4)
			{
				System.out.println("HOW DID YOU KNOW !!!");
				c = c + 1;
			}
		else
			{
				System.out.println("Wrong, the answer was 4.");
				c = c -1;
			}
		
		System.out.println("Q1)	Guess a Number");
		System.out.println("	1)9");
		System.out.println("	2)24");
		System.out.println("	3)42");
		
		Q2 = keyboard.nextInt();
		
		if (Q2 == 3)
			{
				System.out.println("HOW DID YOU KNOW !!!");
				c = c + 1;
			}
		else
			{
				System.out.println("Wrong, the answer was 42.");
				c = c -1;
			}

		
		System.out.println("Q1)	Guess a Number");
		System.out.println("	1)9");
		System.out.println("	2)10");
		System.out.println("	3)21");
		
		Q3 = keyboard.nextInt();
		
		if (Q3 == 3)
			{
				System.out.println("You are a good guesser.");
				c = c + 1;
			}
		else
			{
				System.out.println("Wrong, the answer was 21.");
				c = c -1;
			}
		
		System.out.print("You have scored a "+c+" on the test thats like really bad.");
		
		keyboard.close();
	}
}

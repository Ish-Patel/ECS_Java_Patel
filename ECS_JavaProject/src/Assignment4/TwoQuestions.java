package Assignment4;

import java.util.Scanner;

public class TwoQuestions
{
	public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			String Q1, Q2;
			
			System.out.println("TWO QUESTIONS");
			System.out.println("Think of an object, and I'll try and guess what it is!");
			
			System.out.println("Is it an animal, vegatable, or mineral?");
			Q1 = keyboard.next();
			
			System.out.println("Is it bigger than a breadbox?");
			Q2 = keyboard.next();
			
			if (Q1.equals("animal") && Q2.equals("yes"))
				System.out.println("moose");
			else if (Q1.equals("animal") && Q2.equals("no"))
				System.out.println("squirrel");
			else if (Q1.equals("vegatable") && Q2.equals("no"))
				System.out.println("carrot");
			else if (Q1.equals("vegatable") && Q2.equals("yes"))
				System.out.println("watermelon");
			else if (Q1.equals("mineral") && Q2.equals("no"))
				System.out.println("paperclip");
			else if (Q1.equals("mineral") && Q2.equals("yes"))
				System.out.println("Camaro");
			else
				System.out.println("Answer the questions correctly!");
			keyboard.close();
		}
}

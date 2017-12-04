package Assignment4;

import java.util.Scanner;

public class BMICalcBetter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double lbs, in, m, kg, bmi;
		System.out.println("BMI CALC 2.0");
		
		System.out.print("How tall are you in inches?");
		in = keyboard.nextDouble();
		
		System.out.print("How much do you weigh in pounds?");
		lbs = keyboard.nextDouble();
		
		kg = lbs * 0.4536;
		m = (in/12) * 0.3048;
		bmi = kg/(m * m);
		
		System.out.println("Your bmi is "+bmi+"");
		
		System.out.println("You are:");
		if (bmi >= 30)
			System.out.println("Obese");
		
		else if (bmi >= 25 && bmi <= 29.9 )
			System.out.println("Overweight");
		
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal Weight");
		
		else if (bmi <= 30)
			System.out.println("Underweight");
		
		keyboard.close();
	}
}

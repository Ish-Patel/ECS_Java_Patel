package Assignment8;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double ans = 0;
		double num1 = 0;
		double num2 = 0;
		int stop = 0;
		String opp = "0";
		String test ="go";
		System.out.println("[stop/go] [number] [operator] [number]");
		System.out.println("[number] = 6.7, 5.46, 31,");
		System.out.println("[operator] = +, =, *, /, ^");
		do 
		{
			System.out.println(" ");
			System.out.print(">");
			test = keyboard.next();
			if (test.equals("stop"))
			{
				stop = 1;
			}
			else if (test.equals("go"))
			{
				double num11 = keyboard.nextDouble();
				String oppp = keyboard.next();
				double num22 = keyboard.nextDouble();
				num1 = num11;
				opp = oppp;
				num2 = num22;
				
				if (opp.equals("+"))
					ans = add(num1, num2);
				else if (opp.equals("-"))
					ans = sub(num1, num2);
				else if (opp.equals("*"))
					ans = mult(num1, num2);
				else if (opp.equals("/"))
					ans = div(num1, num2);
				else if (opp.equals("^"))
					ans = powr(num1, num2);
		
				System.out.println(ans);
				num1 = 0;
				num11 = 0;
				num2 = 0;
				num22 = 0;
				opp = "";
				oppp = "";
				ans = 0;
			}
			else
				System.out.println("ERROR\tERROR\tERROR\tERROR\tERROR");
			
		} while (stop == 0);

		
		keyboard.close();
	}

	private static double powr(double num1, double num2) {
		double ans = java.lang.Math.pow(num1,num2);
		return ans;
	}

	private static double div(double num1, double num2) {
		double ans = num1 / num2;
		return ans;
	}

	private static double mult(double num1, double num2) {
		double ans = num1 * num2;
		return ans;
	}

	private static double sub(double num1, double num2) {
		double ans = num1 - num2;
		return ans;
	}

	private static double add(double num1, double num2) {
		double ans = num1 + num2;
		return ans;
	}
}

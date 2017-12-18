package Assignment8;

import java.util.Scanner;

public class AreaCalcRepeat 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int q = 0;
		
		while (q != 1)
		{	
		double anz = 0;
		System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.println("Option:");
		int op = keyboard.nextInt();

		if (op == 1)
		{
			System.out.print("Base:");
			double b = keyboard.nextInt();
			System.out.print("Height:");
			double h = keyboard.nextInt();
			anz = tri(b,h);
		}
		else if (op == 2) 
		{
			System.out.print("Length:");
			double l = keyboard.nextInt();
			System.out.print("Width:");
			double w = keyboard.nextInt();
			anz = rec(l,w);
		}
		else if (op == 3) 
		{
			System.out.print("Side:");
			double s = keyboard.nextInt();
			anz = sqr(s);
		}
		
		else if (op == 4) 
		{
			System.out.print("Radius:");
			double r = keyboard.nextInt();
			anz = cri(r);
		}
		else if (op == 5)
		{
			q = q+1;
			System.out.println("GoodBye");
		}
		else
		{
			System.out.println("Enter Valid Answer");
		}
		
		System.out.println("Area:" + anz);
		}
		System.out.println("Shutting Down");
		
		keyboard.close();
	}
	
	public static double tri(double x, double y)
	{
		double ans = (x*y)/2;
		return ans;
	}
	
	public static double rec(double x, double y)
	{
		double ans = (x*y);
		return ans;
	}
	
	public static double sqr(double x)
	{
		double ans = (x*x);
		return ans;
	}
	
	public static double cri(double x)
	{
		double ans = Math.PI*(x*x);
		return ans;
	}



}

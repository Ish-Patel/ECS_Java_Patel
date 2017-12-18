package Assignment8;

public class EvennessMethod 
{
	public static void main(String[] args)
	{
		String test = ("null");
		for (int n = 1; n <= 100; n++)
		{
			System.out.print(+ n +" ");
			
			test = even(n);
			
			if (test.equals("t"))
				System.out.println("<");
			else if (test.equals("f"))
				System.out.println("=");
			else
				System.out.println(" ");
		}
	}
	
	public static String even(int x)
	{
		String boo = ("null");
		if (x%2 == 0)
		{
			boo = ("t");
		}
		else if (x%3 == 0)
		{
			boo = ("f");
		}
		return boo;
	}
}

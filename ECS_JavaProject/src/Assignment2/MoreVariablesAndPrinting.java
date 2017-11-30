package Assignment2;

public class MoreVariablesAndPrinting
{
	public static void main(String[] args)
	{
		//Non-Number Features
		String myName, myEyes, myTeeth, myHair;
		//Number Features
		int myAge, myHeight, myWeight;
		//Decimal Features
		double myWeightm, myHeightm, total;
		
		//Variables About Me
		myName = "Ish R. Patel";
		myAge = 21;            // not a lie
		myHeight = 64;         // in
		myWeight  = 9001;      // lbs
		myEyes = "Black";
		myTeeth = "White";
		myHair = "Black";
		myWeightm = myWeight * 0.454;    // kg
		myHeightm = myHeight * 2.45;  // cm
		//Totals
		total = myAge + myHeight + myWeight;
		
		
		//Console Text Print
		System.out.println( "Lets talk about " + myName + "." );
		System.out.println( "He's " + myHeight + " in/" + myHeightm + " cm tall." );
		System.out.println( "He's " + myWeight + " lbs/" + myWeightm + " kg." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println( "His teeth are always " + myTeeth + ".");
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + total + "." );
	}
}

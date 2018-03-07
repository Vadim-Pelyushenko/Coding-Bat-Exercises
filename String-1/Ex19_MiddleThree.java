
public class Ex19_MiddleThree
{
	// Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string
	// length will be at least 3.
	public String middleThree(String str)
	{
		int b = str.length() / 2 - 1;
		return str.substring(b, b + 3);
	}
}

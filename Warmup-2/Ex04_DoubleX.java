
public class Ex04_DoubleX
{
	// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	boolean doubleX(String str)
	{
		int ind = str.indexOf("x");
		return ind < str.length() - 1 && str.charAt(ind + 1) == 'x';
	}
}

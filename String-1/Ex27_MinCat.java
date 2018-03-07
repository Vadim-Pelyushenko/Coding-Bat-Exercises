
public class Ex27_MinCat
{
	// Given two strings, append them together (known as "concatenation") and return the result. However, if the strings
	// are different lengths, omit chars from the longer string so it is the same length as the shorter string. So
	// "Hello" and "Hi" yield "loHi". The strings may be any length.
	public String minCat(String a, String b)
	{
		int endA = Math.max(0, a.length() - b.length());
		int startB = Math.max(0, b.length() - a.length());
		return a.substring(endA) + b.substring(startB);
	}
}

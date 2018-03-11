
public class Ex09_MixString
{
	// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second
	// char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
	public String mixString(String a, String b)
	{
		String result = "";
		int end = Math.min(a.length(), b.length());
		for (int i = 0; i < end; i++)
			result = (result + a.charAt(i)) + b.charAt(i);
		result += a.substring(end) + b.substring(end);
		return result;
	}
}


public class Ex14_WithoutEnd2
{
	// Given a string, return a version without both the first and last char of the string. The string may be any
	// length, including 0.
	public String withouEnd2(String str)
	{
		return str.length() < 2 ? "" : str.substring(1, str.length() - 1);
	}
}

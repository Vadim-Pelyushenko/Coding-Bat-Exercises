
public class Ex20_EndX
{
	// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of
	// the string.
	public String endX(String str)
	{
		if (str.length() == 0)
			return str;
		String next = endX(str.substring(1));
		return str.charAt(0) == 'x' ? next + 'x' : str.charAt(0) + next;
	}
}

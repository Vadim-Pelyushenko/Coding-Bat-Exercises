
public class Ex14_NoX
{
	// Given a string, compute recursively a new string where all the 'x' chars have been removed.
	public String noX(String str)
	{
		if (str.length() == 0)
			return str;
		String next = str.substring(1);
		return str.charAt(0) == 'x' ? noX(next) : str.charAt(0) + noX(next);
	}
}

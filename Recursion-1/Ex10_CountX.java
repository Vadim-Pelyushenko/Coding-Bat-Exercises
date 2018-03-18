
public class Ex10_CountX
{
	// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
	public int countX(String str)
	{
		if (str.length() == 0)
			return 0;
		String next = str.substring(1);
		return str.charAt(0) == 'x' ? 1 + countX(next) : countX(next);
	}
}

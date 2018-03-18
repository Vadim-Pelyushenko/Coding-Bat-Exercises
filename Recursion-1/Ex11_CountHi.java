
public class Ex11_CountHi
{
	// Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
	public int countHi(String str)
	{
		if (str.length() < 2)
			return 0;
		String next = str.substring(1);
		return str.substring(0, 2).equals("hi") ? 1 + countHi(next) : countHi(next);
	}
}

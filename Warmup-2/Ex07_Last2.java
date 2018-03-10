
public class Ex07_Last2
{
	// Given a string, return the count of the number of times that a substring length 2 appears in the string and also
	// as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	public int last2(String str)
	{
		if (str.length() < 3)
			return 0;
		int i = str.length() - 2;
		String s = str.substring(i);
		int total = 0;
		for (i -= 1; i >= 0; i--)
		{
			if (str.substring(i, i + 2).equals(s))
				total++;
		}
		return total;
	}
}

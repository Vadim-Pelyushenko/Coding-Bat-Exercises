
public class Ex09_MaxBlock
{
	// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that
	// are the same.
	public int maxBlock(String str)
	{
		if (str.length() < 2)
			return str.length();
		int max = 1;
		for (int i = 0; i < str.length();)
		{
			int check = 1;
			char c = str.charAt(i);
			while (i + check < str.length() && str.charAt(i + check) == c)
				check++;
			if (check > max)
				max = check;
			i += check;
		}
		return max;
	}
}

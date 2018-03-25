
public class Ex07_SameEnds
{
	// Given a string, return the longest substring that appears at both the beginning and end of the string without
	// overlapping. For example, sameEnds("abXab") is "ab".
	public String sameEnds(String string)
	{
		int max = 0;
		int length = 0;
		while (length <= string.length() / 2)
		{
			String front = string.substring(0, length);
			String back = string.substring(string.length() - length);
			if (front.equals(back))
				max = length;
			length++;
		}
		return string.substring(0, max);
	}
}

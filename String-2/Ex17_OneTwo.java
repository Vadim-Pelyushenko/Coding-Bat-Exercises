
public class Ex17_OneTwo
{
	// Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields
	// "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
	// fewer than 3 chars at the end.
	public String oneTwo(String str)
	{
		String result = "";
		int i;
		for (i = 2; i < str.length(); i += 3)
			result += str.substring(i - 1, i + 1) + str.charAt(i - 2);
		return result;
	}
}

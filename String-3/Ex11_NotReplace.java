
public class Ex11_NotReplace
{
	// Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is
	// not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in
	// "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
	public String notReplace(String str)
	{
		String result = "";
		int i = 0;
		while (i <= str.length() - 2)
		{
			if (isValid(str, i))
			{
				result += "is not";
				i += 2;
			}
			else
				result += str.charAt(i++);
		}
		result += str.substring(i);
		return result;
	}

	// To make code simpler to write
	public boolean isValid(String str, int ind)
	{
		boolean validS = ind == 0 || !isLetter(str, ind - 1);
		boolean validE = ind == str.length() - 2 || !isLetter(str, ind + 2);
		return validS && validE && str.substring(ind, ind + 2).equals("is");
	}

	// For convenience
	public boolean isLetter(String str, int ind)
	{
		return Character.isLetter(str.charAt(ind));
	}
}

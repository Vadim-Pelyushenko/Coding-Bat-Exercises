
public class Ex21_AtFirst
{
	// Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@'
	// for the missing chars.
	public String atFirst(String str)
	{
		switch (str.length())
		{
			case 0:
				return "@@";
			case 1:
				return str + "@";
			default:
				return str.substring(0, 2);
		}
	}
}

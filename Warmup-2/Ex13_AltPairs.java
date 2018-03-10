
public class Ex13_AltPairs
{
	// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	public String altPairs(String str)
	{
		String result = "";
		int i = 0;
		while (true)
		{
			if (i < str.length())
				result += str.charAt(i);
			else
				break;
			i++;
			if (i < str.length())
				result += str.charAt(i);
			else
				break;
			i += 3;
		}
		return result;
	}
}

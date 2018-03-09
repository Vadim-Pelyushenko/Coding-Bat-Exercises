
public class Ex04_DoubleX
{
	// Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	boolean doubleX(String str)
	{
		int ind = -1;
		for (int i = 0; i < str.length() - 1; i++)
		{
			if (str.charAt(i) == 'x')
			{
				return str.charAt(i + 1) == 'x';
			}
		}
		return false;
	}
}

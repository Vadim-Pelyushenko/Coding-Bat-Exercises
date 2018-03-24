
public class Ex04_GHappy
{
	// We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
	// Return true if all the g's in the given string are happy.
	public boolean gHappy(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'g')
			{
				if (i + 1 == str.length() || str.charAt(i + 1) != 'g')
					return false;
				i += 2;
				while (i < str.length() && str.charAt(i) == 'g')
					i++;
			}
		}
		return true;
	}
}

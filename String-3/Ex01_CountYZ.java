
public class Ex01_CountYZ
{
	// Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
	// count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there
	// is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an
	// alphabetic letter.)
	public int countYZ(String str)
	{
		int total = 0;
		for (int i = 0; i < str.length() - 1; i++)
		{
			char c = str.charAt(i);
			if (ender(c) && !Character.isLetter(str.charAt(i + 1)))
				total++;
		}
		char lastChar = str.charAt(str.length() - 1);
		if (ender(lastChar))
			total++;
		return total;
	}

	public boolean ender(char a)
	{
		return a == 'z' || a == 'Z' || a == 'y' || a == 'Y';
	}
}

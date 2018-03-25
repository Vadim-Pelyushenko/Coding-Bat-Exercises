
public class Ex08_MirrorEnds
{
	// Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In
	// other words, zero or more characters at the very begining of the given string, and at the very end of the string
	// in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
	public String mirrorEnds(String string)
	{
		int i = 0;
		while (i < string.length())
		{
			char f = string.charAt(i);
			char e = string.charAt(string.length() - i - 1);
			if (f == e)
				i++;
			else
				break;
		}
		return string.substring(0, i);
	}
}

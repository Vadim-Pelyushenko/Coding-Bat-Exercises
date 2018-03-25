
public class Ex02_WithoutString
{
	// Given two strings, base and remove, return a version of the base string where all instances of the remove string
	// have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only
	// non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	public String withoutString(String base, String remove)
	{
		String result = "";
		int i = 0;
		while (i <= base.length() - remove.length())
		{
			String check = base.substring(i, i + remove.length());
			if (check.equalsIgnoreCase(remove))
				i += remove.length();
			else
				result += base.charAt(i++);
		}
		return result + base.substring(i);
	}
}

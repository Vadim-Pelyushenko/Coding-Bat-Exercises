
public class Ex32_WithoutX
{
	// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise
	// return the string unchanged.
	public String withoutX(String str)
	{
		if (str.length() == 0 || str.equals("x"))
			return "";
		int start = str.charAt(0) == 'x' ? 1 : 0;
		int end = str.charAt(str.length() - 1) == 'x' ? 1 : 0;
		return str.substring(start, str.length() - end);
	}
}

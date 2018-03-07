
public class Ex33_WithoutX2
{
	// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
	// otherwise return the string unchanged. This is a little harder than it looks.
	public String withoutX2(String str)
	{
		switch (str.length())
		{
			case 0:
				return str;
			case 1:
				return str.equals("x") ? "" : str;
			default:
				return str.substring(0, 2).replace("x", "") + str.substring(2);
		}
	}
}

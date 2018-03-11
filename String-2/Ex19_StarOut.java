
public class Ex19_StarOut
{
	public String starOut(String str)
	{
		if (str.length() == 0)
			return "";
		if (str.length() == 1)
			return str.charAt(0) == '*' ? "" : str;
		byte[] deleted = new byte[str.length()];
		for (int i = 1; i < str.length() - 1; i++)
			if (str.charAt(i) == '*')
			{
				deleted[i - 1] = 1;
				deleted[i] = 1;
				deleted[i + 1] = 1;
			}
		if (str.charAt(0) == '*')
		{
			deleted[0] = 1;
			deleted[1] = 1;
		}
		int e = str.length() - 1;
		if (str.charAt(e) == '*')
		{
			deleted[e] = 1;
			deleted[e - 1] = 1;
		}
		String result = "";
		for (int i = 0; i < deleted.length; i++)
		{
			if (deleted[i] != 1)
				result += str.charAt(i);
		}
		return result;
	}
}

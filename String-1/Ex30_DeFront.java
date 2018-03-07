
public class Ex30_DeFront
{
	// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
	// second char if it is 'b'. The string may be any length. Harder than it looks.
	public String deFront(String str)
	{
		if (str.length() == 0)
			return str;

		if (str.length() == 1)
			return str.equals("a") ? str : "";

		String result = "";
		if (str.charAt(0) == 'a')
			result += "a";
		if (str.charAt(1) == 'b')
			result += "b";
		return result + str.substring(2);
	}
}

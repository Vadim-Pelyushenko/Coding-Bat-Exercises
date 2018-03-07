
public class Ex30_DeFront
{
	// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
	// second char if it is 'b'. The string may be any length. Harder than it looks.
	public String deFront(String str)
	{
		switch (str.length())
		{
			case 0:
				return str;
			case 1:
				return str.equals("a") ? str : "";
			default:
				String result = str.charAt(0) == 'a' ? "a" : "";
				result += str.charAt(1) == 'b' ? "b" : "";
				return result + str.substring(2);
		}
	}
}

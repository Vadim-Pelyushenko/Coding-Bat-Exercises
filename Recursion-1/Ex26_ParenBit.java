
public class Ex26_ParenBit
{
	// Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the
	// parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
	public String parenBit(String str)
	{
		int end = str.length() - 1;
		if (str.charAt(0) == '(')
		{
			if (str.charAt(end) == ')')
				return str;
			return parenBit(str.substring(0, end));
		}
		else if (str.charAt(end) == ')')
			return parenBit(str.substring(1, end + 1));
		return parenBit(str.substring(1, end));
	}
}

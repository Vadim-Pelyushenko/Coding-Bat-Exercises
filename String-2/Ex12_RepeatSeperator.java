
public class Ex12_RepeatSeperator
{
	// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated
	// by the separator string.
	public String repeatSeparator(String word, String sep, int count)
	{
		if (count == 0)
			return "";
		String result = word;
		for (int i = 1; i < count; i++)
			result += sep + word;
		return result;
	}
}

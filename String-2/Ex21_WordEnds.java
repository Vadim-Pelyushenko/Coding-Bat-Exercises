
public class Ex21_WordEnds
{
	// Given a string and a non-empty word string, return a string made of each char just before and just after every
	// appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char
	// may be included twice if it is between two words.
	public String wordEnds(String str, String word)
	{
		int ind = str.indexOf(word);
		String result = "";
		while (ind != -1)
		{
			if (ind != 0)
				result += str.charAt(ind - 1);
			ind += word.length();
			if (ind >= str.length())
				break;
			result += str.charAt(ind);
			ind = str.indexOf(word, ind);
		}
		return result;
	}
}

import java.util.ArrayList;
import java.util.List;

public class Ex07_WordsWithoutList
{
	// Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are
	// omitted. See wordsWithout() below which is more difficult because it uses arrays.
	public List wordsWithoutList(String[] words, int len)
	{
		ArrayList<String> result = new ArrayList<String>();
		for (String s : words)
			if (s.length() != len)
				result.add(s);
		return result;
	}
}

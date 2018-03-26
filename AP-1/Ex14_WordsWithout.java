
public class Ex14_WordsWithout
{
	// Given an array of strings, return a new array without the strings that are equal to the target string. One
	// approach is to count the occurrences of the target string, make a new array of the correct length, and then copy
	// over the correct strings.
	public String[] wordsWithout(String[] words, String target)
	{
		int count = 0;
		for (String word : words)
			if (!word.equals(target))
				count++;

		String[] result = new String[count];
		int next = 0;

		for (String word : words)
			if (!word.equals(target))
				result[next++] = word;
		return result;
	}
}

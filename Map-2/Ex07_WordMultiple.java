import java.util.HashMap;
import java.util.Map;

public class Ex07_WordMultiple
{
	// Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is
	// true if that string appears 2 or more times in the array.
	public Map<String, Boolean> wordMultiple(String[] strings)
	{
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		for (String s : strings)
			if (map.containsKey(s))
				map.put(s, true);
			else
				map.put(s, false);
		return map;
	}
}

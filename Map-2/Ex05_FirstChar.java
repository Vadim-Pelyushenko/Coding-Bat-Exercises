import java.util.HashMap;
import java.util.Map;

public class Ex05_FirstChar
{
	// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
	// seen, with the value of all the strings starting with that character appended together in the order they appear
	// in the array.
	public Map<String, String> firstChar(String[] strings)
	{
		Map<String, String> map = new HashMap<String, String>();
		for (String s : strings)
		{
			String key = s.charAt(0) + "";
			if (map.containsKey(key))
				map.put(key, map.get(key) + s);
			else
				map.put(key, s);
		}
		return map;
	}
}

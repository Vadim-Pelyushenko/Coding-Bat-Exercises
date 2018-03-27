import java.util.HashMap;
import java.util.Map;

public class Ex03_Pairs
{
	// Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its
	// first character as a key with its last character as the value.
	public Map<String, String> pairs(String[] strings)
	{
		Map<String, String> map = new HashMap<String, String>();
		for (String s : strings)
			map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
		return map;
	}
}

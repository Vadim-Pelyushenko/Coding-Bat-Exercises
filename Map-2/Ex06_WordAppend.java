import java.util.HashMap;
import java.util.Map;

public class Ex06_WordAppend
{
	// Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
	// etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
	public String wordAppend(String[] strings)
	{
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings)
			if (map.containsKey(s))
			{
				int numOcc = map.get(s) + 1;
				map.put(s, numOcc);
				if (numOcc % 2 == 0)
					result += s;
			}
			else
				map.put(s, 1);
		return result;
	}
}

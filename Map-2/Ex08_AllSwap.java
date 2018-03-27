import java.util.HashMap;
import java.util.Map;

public class Ex08_AllSwap
{
	// We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
	// return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap
	// the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a
	// map, this can be solved making just one pass over the array. More difficult than it looks.
	public String[] allSwap(String[] strings)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++)
		{
			String s = strings[i];
			if (s.length() == 0)
				continue;
			String key = s.charAt(0) + "";
			if (map.containsKey(key))
			{
				swap(strings, i, map.get(key));
				map.remove(key);
			}
			else
				map.put(key, i);
		}
		return strings;
	}

	public void swap(String[] strings, int a, int b)
	{
		String temp = strings[a];
		strings[a] = strings[b];
		strings[b] = temp;
	}
}

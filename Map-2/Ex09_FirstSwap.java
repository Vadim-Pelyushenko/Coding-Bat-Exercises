import java.util.HashMap;
import java.util.Map;

public class Ex09_FirstSwap
{
	// We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
	// return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap
	// the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its
	// later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult
	// than it looks.
	public String[] firstSwap(String[] strings)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++)
		{
			String key = strings[i].charAt(0) + "";
			if (map.containsKey(key))
			{
				if (map.get(key) == -1)
					continue;
				swap(strings, map.get(key), i);
				map.put(key, -1);
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

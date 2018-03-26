import java.util.Map;

public class Ex09_MapAB4
{
	// Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then
	// set "c" to have the longer value. If the values exist and have the same length, change them both to the empty
	// string in the map.
	public Map<String, String> mapAB4(Map<String, String> map)
	{
		if (map.containsKey("a") && map.containsKey("b"))
		{
			String av = map.get("a");
			String bv = map.get("b");
			if (av.length() == bv.length())
			{
				map.put("a", "");
				map.put("b", "");
			}
			else
				map.put("c", av.length() > bv.length() ? av : bv);
		}
		return map;
	}
}

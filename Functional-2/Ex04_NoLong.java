import java.util.List;

public class Ex04_NoLong
{
	// Given a list of strings, return a list of the strings, omitting any string length 4 or more.
	public List<String> noLong(List<String> strings)
	{
		strings.removeIf(s -> s.length() >= 4);
		return strings;
	}
}

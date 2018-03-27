import java.util.List;

public class Ex04_Copies3
{
	// Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated
	// together.
	public List<String> copies3(List<String> strings)
	{
		strings.replaceAll(s -> s + s + s);
		return strings;
	}
}

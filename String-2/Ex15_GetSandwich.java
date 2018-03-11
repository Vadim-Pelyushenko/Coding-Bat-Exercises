
public class Ex15_GetSandwich
{
	// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
	// appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
	public String getSandwich(String str)
	{
		int start = str.indexOf("bread");
		int end = str.lastIndexOf("bread");
		return start == end ? "" : str.substring(start + 5, end);
	}
}

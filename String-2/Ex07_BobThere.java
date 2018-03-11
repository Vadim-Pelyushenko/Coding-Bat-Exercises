
public class Ex07_BobThere
{
	// Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
	public boolean bobThere(String str)
	{
		return str.matches("(.*)b.b(.*)");
	}
}

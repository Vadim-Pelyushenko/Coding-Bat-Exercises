
public class Ex12_StringX
{
	// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
	// should not be removed.
	public String stringX(String str)
	{
		if (str.length() < 3)
			return str;
		return str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(str.length() - 1);
	}
}

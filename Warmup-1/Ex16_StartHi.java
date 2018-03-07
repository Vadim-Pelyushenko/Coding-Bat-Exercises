
public class Ex16_StartHi
{

	// Given a string, return true if the string starts with "hi" and false otherwise.
	public boolean startHi(String str)
	{
		// the first condition is necessary to allow short-circuit evaluation
		// the prevents an index out of bounds
		return str.length() >= 2 && str.substring(0, 2).equals("hi");
	}
}


public class Ex28_ExtraFront
{
	// Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may
	// be any length. If there are fewer than 2 chars, use whatever is there.
	public String extraFront(String str)
	{
		String front = str.substring(0, Math.min(2, str.length()));
		return front + front + front;
	}
}

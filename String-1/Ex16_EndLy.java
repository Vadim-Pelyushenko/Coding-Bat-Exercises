
public class Ex16_EndLy
{
	// Given a string, return true if it ends in "ly".
	public boolean endsLy(String str)
	{
		return str.length() < 2 ? false : str.substring(str.length() - 2).equals("ly");
	}
}

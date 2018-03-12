
public class Ex12_ChangeXY
{
	// Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed
	// to 'y' chars.
	public String changeXY(String str)
	{
		if (str.length() == 0)
			return str;
		char start = str.charAt(0) == 'x' ? 'y' : str.charAt(0);
		return start + changeXY(str.substring(1));
	}
}

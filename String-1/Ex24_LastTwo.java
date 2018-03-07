
public class Ex24_LastTwo
{
	// Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
	// yields "codign".
	public String lastTwo(String str)
	{
		int sec = str.length() - 2;
		return sec < 0 ? str : str.substring(0, sec) + str.charAt(sec + 1) + str.charAt(sec);
	}
}

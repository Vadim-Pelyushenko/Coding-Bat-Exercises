
public class Ex04_Diff21
{
	// Verbatim from the site
	// Given an int n, return the absolute difference between n and 21,
	// except return double the absolute difference if n is over 21.
	public int diff21(int n)
	{
		int absdiff = Math.abs(n - 21);
		return n > 21 ? 2 * absdiff : absdiff;
	}
}

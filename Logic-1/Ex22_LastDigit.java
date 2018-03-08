
public class Ex22_LastDigit
{
	// Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are
	// non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
	public boolean lastDigit(int a, int b, int c)
	{
		int ra = a % 10;
		int rb = b % 10;
		int rc = c % 10;
		return ra == rb || rb == rc || rc == ra;
	}
}

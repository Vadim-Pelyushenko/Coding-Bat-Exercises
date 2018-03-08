
public class Ex12_Less20
{
	// Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39
	// return true, but 40 returns false. See also: Introduction to Mod
	public boolean less20(int n)
	{
		int r = n % 20;
		return r == 18 || r == 19;
	}
}

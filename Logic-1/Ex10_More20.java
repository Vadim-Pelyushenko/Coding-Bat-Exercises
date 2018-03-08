
public class Ex10_More20
{
	// Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
	public boolean more20(int n)
	{
		int r = n % 20;
		return r == 1 || r == 2;
	}
}

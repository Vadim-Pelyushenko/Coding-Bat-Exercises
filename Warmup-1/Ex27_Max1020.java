
public class Ex27_Max1020
{
	// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if
	// neither is in that range.
	public int max1020(int a, int b)
	{
		boolean aInRange = (a >= 10 && a <= 20);
		boolean bInRange = (b >= 10 && b <= 20);

		if (aInRange)
		{
			if (bInRange)
				return a > b ? a : b;
			return a;
		}
		return bInRange ? b : 0;
	}
}

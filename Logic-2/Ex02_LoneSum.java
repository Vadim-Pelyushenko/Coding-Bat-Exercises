
public class Ex02_LoneSum
{
	// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
	// it does not count towards the sum.
	public int loneSum(int a, int b, int c)
	{
		if (a == b)
			return c == a ? 0 : c;
		else if (b == c)
			return a;
		else if (a == c)
			return b;
		return a + b + c;
	}
}

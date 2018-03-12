
public class Ex02_LoneSum
{
	// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
	// it does not count towards the sum.
	public int loneSum(int a, int b, int c)
	{
		int sum;
		if (a == b)
			sum = c == a ? 0 : c;
		else if (b == c)
			sum = a;
		else if (a == c)
			sum = b;
		else
			sum = a + b + c;
		return sum;
	}
}

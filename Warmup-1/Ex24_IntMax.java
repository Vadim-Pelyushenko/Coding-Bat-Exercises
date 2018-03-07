
public class Ex24_IntMax
{
	// Given three int values, a b c, return the largest.
	public int intMax(int a, int b, int c)
	{
		int m = a > b ? a : b;
		return c > m ? c : m;
	}
}

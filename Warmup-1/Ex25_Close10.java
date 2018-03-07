
public class Ex25_Close10
{
	// Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note
	// that Math.abs(n) returns the absolute value of a number.
	public int close10(int a, int b)
	{
		int d0 = Math.abs(a - 10);
		int d1 = Math.abs(b - 10);

		if (d0 == d1)
			return 0;

		return d0 < d1 ? a : b;
	}
}

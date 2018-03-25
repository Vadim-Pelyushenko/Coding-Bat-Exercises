
public class Ex06_SquareUp
{
	// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1, 0, 2, 1, 3, 2,
	// 1} (spaces added to show the 3 groups).
	public int[] squareUp(int n)
	{
		int[] result = new int[n * n];
		for (int i = 1; i <= n; i++)
		{
			for (int j = i * n - i; j < result.length; j += n)
				result[j] = i;
		}
		return result;
	}
}

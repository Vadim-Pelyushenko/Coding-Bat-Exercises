
public class Ex06_CloseFar
{
	// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
	// is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a
	// number.
	public boolean closeFar(int a, int b, int c)
	{
		int[] dists = { dist(a, b), dist(b, c), dist(a, c) };
		int numClose = 0;
		int numFar = 0;
		for (int z : dists)
			if (z < 2)
				numClose++;
			else
				numFar++;
		return numClose == 1 && numFar == 2;
	}

	public int dist(int a, int b)
	{
		return Math.abs(a - b);
	}
}

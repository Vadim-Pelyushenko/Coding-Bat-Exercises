
public class Ex01_CountEvens
{
	// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2
	// is 1.
	public int countEvens(int[] nums)
	{
		int t = 0;
		for (int i : nums)
			if (i % 2 == 0)
				t++;
		return t;
	}
}

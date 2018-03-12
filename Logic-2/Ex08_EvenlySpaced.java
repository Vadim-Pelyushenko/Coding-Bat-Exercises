
public class Ex08_EvenlySpaced
{
	// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values
	// are evenly spaced, so the difference between small and medium is the same as the difference between medium and
	// large.
	public boolean evenlySpaced(int a, int b, int c)
	{
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);
		int mid = a + b + c - max - min;
		return max - mid == mid - min;
	}
}

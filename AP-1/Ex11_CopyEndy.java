
public class Ex11_CopyEndy
{
	// We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of
	// positive ints, return a new array of length "count" containing the first endy numbers from the original array.
	// Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at
	// least "count" endy numbers.
	public int[] copyEndy(int[] nums, int count)
	{
		int[] result = new int[count];
		int next = 0;
		for (int num : nums)
		{
			if (isEndy(num))
			{
				result[next++] = num;
				if (next == result.length)
					break;
			}
		}
		return result;
	}

	public boolean isEndy(int n)
	{
		return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
	}
}

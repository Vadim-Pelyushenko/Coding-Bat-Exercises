
public class Ex10_CopyEvens
{
	// Given an array of positive ints, return a new array of length "count" containing the first even numbers from the
	// original array. The original array will contain at least "count" even numbers.
	public int[] copyEvens(int[] nums, int count)
	{
		int[] result = new int[count];
		int next = 0;
		for (int num : nums)
		{
			if (num % 2 == 0)
			{
				result[next++] = num;
				if (next == result.length)
					break;
			}
		}
		return result;
	}
}


public class Ex01_MaxSpan
{
	// Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number
	// of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the
	// given array. (Efficiency is not a priority.)
	public int maxSpan(int[] nums)
	{
		if (nums.length < 2)
			return nums.length;

		int max = 1;
		for (int i = 0; i < nums.length - 1; i++)
		{
			int span = 0;
			for (int j = i + 1; j < nums.length; j++)
			{
				if (nums[j] == nums[i])
					span = j - i;
			}
			if (++span > max)
				max = span;
		}
		return max;
	}
}

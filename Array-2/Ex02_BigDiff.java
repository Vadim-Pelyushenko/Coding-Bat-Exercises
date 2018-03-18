
public class Ex02_BigDiff
{
	// Given an array length 1 or more of ints, return the difference between the largest and smallest values in the
	// array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two
	// values.
	public int bigDiff(int[] nums)
	{
		int max = nums[0];
		int min = nums[0];
		for (int i : nums)
		{
			if (i < min)
				min = i;
			else if (i > max)
				max = i;
		}
		return max - min;
	}
}

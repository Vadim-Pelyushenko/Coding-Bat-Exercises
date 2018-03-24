
public class Ex08_Split53
{
	// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is
	// the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values
	// that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
	public boolean check(int start, int[] nums, int g3, int g5)
	{
		if (start >= nums.length)
			return g3 == g5;

		if (nums[start] % 3 == 0)
			return check(start + 1, nums, g3 + nums[start], g5);
		if (nums[start] % 5 == 0)
			return check(start + 1, nums, g3, g5 + nums[start]);
		return check(start + 1, nums, g3 + nums[start], g5) || check(start + 1, nums, g3, g5 + nums[start]);
	}

	public boolean split53(int[] nums)
	{
		return check(0, nums, 0, 0);
	}
}

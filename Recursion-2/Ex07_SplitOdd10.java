
public class Ex07_SplitOdd10
{
	// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a
	// multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a
	// recursive helper method that takes whatever arguments you like, and make the initial call to your recursive
	// helper from splitOdd10(). (No loops needed.)
	public boolean splitOdd10(int[] nums)
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];

		return sum % 2 == 1 && check(0, nums, 0);
	}

	public boolean check(int start, int[] nums, int current)
	{
		if (current % 10 == 0)
			return true;
		if (start >= nums.length)
			return false;

		return check(start + 1, nums, current) || check(start + 1, nums, current + nums[start]);
	}
}

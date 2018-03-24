
public class Ex06_SplitArray
{
	// Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are
	// the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever
	// arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
	public boolean splitArray(int[] nums)
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];

		return sum % 2 == 0 && groupSum(0, nums, sum / 2);
	}

	public boolean groupSum(int start, int[] nums, int target)
	{
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;
		return groupSum(start + 1, nums, target) || groupSum(start + 1, nums, target - nums[start]);
	}
}

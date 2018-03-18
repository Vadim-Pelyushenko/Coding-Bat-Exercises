
public class Ex03_CenteredAverage
{
	// Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except
	// ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore
	// just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume
	// that the array is length 3 or more.
	public int centeredAverage(int[] nums)
	{
		int max = nums[0];
		int min = nums[0];
		int sum = 0;
		for (int i : nums)
		{
			if (i < min)
				min = i;
			else if (i > max)
				max = i;
			sum += i;
		}
		return (sum - min - max) / (nums.length - 2);
	}
}

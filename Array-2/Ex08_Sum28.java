
public class Ex08_Sum28
{
	// Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
	public boolean sum28(int[] nums)
	{
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 2)
			{
				count++;
				if (count > 5)
					return false;
			}
		}
		return count == 4;
	}
}

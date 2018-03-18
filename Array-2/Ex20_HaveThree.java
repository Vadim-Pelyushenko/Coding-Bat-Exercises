
public class Ex20_HaveThree
{
	// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to
	// each other.
	public boolean haveThree(int[] nums)
	{
		if (nums.length < 3)
			return false;

		int count = 0;
		for (int i = nums.length - 1; i >= 1; i--)
		{
			if (nums[i] == 3)
			{
				count++;
				if (nums[i - 1] == 3 || count > 3)
					return false;
			}
		}
		count += nums[0] == 3 ? 1 : 0;
		return count == 3;
	}
}

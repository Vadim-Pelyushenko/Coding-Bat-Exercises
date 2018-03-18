
public class Ex21_TwoTwo
{
	// Given an array of ints, return true if every 2 that appears in the array is next to another 2.
	public boolean twoTwo(int[] nums)
	{
		if (nums.length < 2)
			return nums.length == 0 ? true : nums[0] != 2;
		int end = nums.length - 1;
		if (nums[end] == 2 && nums[--end] != 2)
			return false;
		for (int i = end; i >= 1; i--)
			if (nums[i] == 2)
				if (nums[i - 1] != 2 && nums[i + 1] != 2)
					return false;
				else
					i--;
		return nums[0] != 2 || nums[1] == 2;
	}
}


public class Ex25_Unlucky1
{
	// We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array
	// contains an unlucky 1 in the first 2 or last 2 positions in the array.
	public boolean unlucky1(int[] nums)
	{
		return unluckySpot(nums, 0) || unluckySpot(nums, 1) || unluckySpot(nums, nums.length - 2);
	}

	public boolean unluckySpot(int[] nums, int pos)
	{
		return pos >= 0 && pos + 1 < nums.length && nums[pos] == 1 && nums[pos + 1] == 3;
	}
}
